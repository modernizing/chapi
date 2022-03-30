package chapi.ast.kotlinast

import chapi.ast.antlr.KotlinParser
import chapi.domain.core.CallType
import chapi.domain.core.CodeCall
import chapi.domain.core.CodeDataStruct
import chapi.domain.core.CodeField
import chapi.domain.core.CodeFunction
import chapi.domain.core.CodeImport
import chapi.domain.core.CodeProperty
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

/**
 * listen to full identifier with complex type and sceneries, such as:
 * - call relationship
 * - lambda expression
 * - coroutine
 */
open class KotlinFullIdentListener(fileName: String) : KotlinBasicIdentListener(fileName) {

    private val postClassHandler = mutableListOf<(CodeDataStruct) -> Unit>()
    override fun buildFunction(ctx: KotlinParser.FunctionDeclarationContext): CodeFunction =
        super.buildFunction(ctx).apply {
            val functionCalls = buildFunctionCalls(ctx)
            if (functionCalls != null) {
                FunctionCalls = functionCalls.toTypedArray()
            }
        }

    private fun buildFunctionCalls(ctx: KotlinParser.FunctionDeclarationContext): List<CodeCall>? =
        ctx.functionBody()?.block()?.statements()?.statement()?.mapNotNull(::buildFunctionCall)

    private fun buildFunctionCall(it: KotlinParser.StatementContext): CodeCall? {
        val result = Regex("(\\w+\\.?)+\\((.*)\\)").find(it.text) ?: return null

        val matchedExpression = result.value
        val functionName = result.groupValues[1]
        val parameters = arrayOf(
            parseParameter(result.groupValues[2])
        )

        val matchedStart = result.groups[0]!!.range.first
        val functionStart = result.groups[1]!!.range.first
        val nodeName = matchedExpression.substring(0, maxOf(functionStart - matchedStart - 1, 0))

        return CodeCall(
            Type = if (functionName[0].isUpperCase()) CallType.CREATOR else CallType.FUNCTION,
            NodeName = nodeName,
            FunctionName = functionName,
            Parameters = parameters,
            Position = it.getPosition(),
        ).refineIfExistsCreator()
    }

    private fun parseParameter(text: String) = CodeProperty(
        TypeType = when {
            text.matches(Regex("\".*\"")) -> getTypeFullName("String")
            text.matches(Regex("\\d+")) -> getTypeFullName("Number")
            else -> ""
        },
        TypeValue = text.removePrefix("\"").removeSuffix("\"")
    )

    // correct the function info
    private fun CodeCall.refineIfExistsCreator(): CodeCall {
        // search the node in declared classes (for individual function)
        for (clazz in classes) {
            this.refineWithClass(clazz) ?: return this
        }

        // search the node in imported classes/functions
        for (import in imports) {
            this.refineWithImport(import) ?: return this
        }

        // search the node in current class
        for (field in currentNode.Fields) {
            this.refineWithField(field) ?: return this
        }

        // not found yet, register a post handler to check the node in the next class
        postClassHandler.add { this.refineWithClass(it) }
        return this
    }

    // return null to quick exit
    private fun CodeCall.refineWithClass(it: CodeDataStruct): CodeCall? {
        if (it.NodeName == FunctionName) {
            Type = CallType.CREATOR
            Package = it.Package
            return null
        }
        return this
    }

    private fun CodeCall.refineWithImport(it: CodeImport): CodeCall? {
        if (it.AsName == NodeName) {
            Package = it.Source.substringBeforeLast('.')
            return null
        }

        if (it.AsName == FunctionName && FunctionName[0].isUpperCase()) {
            Package = it.Source
            NodeName = FunctionName
            return null;
        }

        if (it.AsName == FunctionName) {
            val fullNodeName = it.Source.substringBeforeLast('.')
            Package = fullNodeName.substringBeforeLast('.')
            NodeName = fullNodeName.substringAfterLast('.')
            return null
        }
        return this
    }

    private fun CodeCall.refineWithField(it: CodeField): CodeCall? {
        if (it.TypeKey == NodeName) {
            val fullNodeName = it.TypeType
            Package = fullNodeName.substringBeforeLast('.')
            NodeName = fullNodeName.substringAfterLast('.')
            return null
        }
        return this
    }

    private var nestedCallMap: MutableMap<String, CodeCall> = mutableMapOf()

    override fun enterPostfixUnaryExpression(ctx: KotlinParser.PostfixUnaryExpressionContext?) {
        // one or more call, maybe call map
        var calls: Array<CodeCall> = arrayOf()
        var lastIdentifier = ""
        var lastPackage = ""
        var lastFunctionName = ""
        var lastNodeName = ""

        var lastPostfixChildType = ""
        ctx!!.children.forEach { child ->
            when (child) {
                // sometimes, it just a tests.
                is KotlinParser.PrimaryExpressionContext -> {
                    textFromPrimaryExpr(child, lastIdentifier)
                }
                is KotlinParser.PostfixUnarySuffixContext -> {
                    println("PostfixUnaryType: ${child.children[0].javaClass.simpleName}, Text: ${child.children[0].text}")
                    when (val postfix = child.children[0]) {
                        is KotlinParser.CallSuffixContext -> {
                            val valueArguments = postfix.valueArguments()

                            var parameters: Array<CodeProperty> = arrayOf()
                            if (valueArguments != null) {
                                parameters = valueArguments.valueArgument().map {
                                    // todo: handle for has sub expression
//                                  if (it.expression() != null) {}
                                    parseParameter(it.text)
                                }.toTypedArray()
                            }

                            if (lastPostfixChildType == "NavigationSuffixContext") {
                                println(calls.size)
                                calls = calls.dropLast(1).toTypedArray()
                                println(calls.size)
                                lastIdentifier = "$lastIdentifier.$lastFunctionName"
                            }

                            val call = CodeCall(
                                NodeName = lastNodeName,
                                FunctionName = lastIdentifier,
                                Parameters = parameters,
                                Position = ctx.getPosition()
                            ).refineIfExistsCreator()
                            calls += call

                            lastPostfixChildType = "CallSuffixContext"
                        }
                        is KotlinParser.NavigationSuffixContext -> {
                            // parameters ?
                            if (postfix.parenthesizedExpression() != null) {
                                println("todo: parse parameters")
                            }
                            if (postfix.simpleIdentifier() != null) {
                                val navigationName = postfix.simpleIdentifier().text
                                var parameters: Array<CodeProperty> = arrayOf()
                                if (postfix.parenthesizedExpression() != null) {
                                    val param = postfix.parenthesizedExpression().expression().text
                                    parameters += parseParameter(param)
                                }

                                lastFunctionName = navigationName

                                val call = CodeCall(
                                    NodeName = lastIdentifier,
                                    FunctionName = navigationName,
                                    Parameters = parameters,
                                    Package = lastPackage,
                                    Position = ctx.getPosition()
                                ).refineIfExistsCreator()
                                lastPackage = call.Package
                                lastNodeName = call.NodeName
                                calls += call
                            }

                            lastPostfixChildType = "NavigationSuffixContext"
                        }
                        else -> {
                            lastPostfixChildType = child.children[0].javaClass.simpleName
                            println("todo: PostfixUnaryType: $lastPostfixChildType")
                        }
                    }
                }
            }
        }

        if (calls.isNotEmpty()) {
//            currentFunction.FunctionCalls += calls
            println(Json.encodeToString(calls))
        }
    }

    private fun textFromPrimaryExpr(
        child: KotlinParser.PrimaryExpressionContext,
        lastIdentifier: String
    ) {
        var lastIdentifier1 = lastIdentifier
        when {
            child.simpleIdentifier() != null -> {
                lastIdentifier1 = child.simpleIdentifier().text
            }
            child.stringLiteral() != null -> {
                lastIdentifier1 = child.stringLiteral().text
            }
            else -> {
                lastIdentifier1 = child.text
            }
        }
    }

    override fun buildClass(ctx: KotlinParser.ClassDeclarationContext): CodeDataStruct {
        return super.buildClass(ctx).also {
            postClassHandler.forEach { callback -> callback(it) }
        }
    }
}
