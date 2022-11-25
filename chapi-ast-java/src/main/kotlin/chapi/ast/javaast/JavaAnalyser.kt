package chapi.ast.javaast

import chapi.ast.antlr.JavaLexer
import chapi.ast.antlr.JavaParser
import chapi.domain.core.CodeDataStruct
import chapi.domain.core.CodeContainer
import chapi.parser.ParseMode
import chapi.parser.TwoStepAnalyser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker

open class JavaAnalyser : TwoStepAnalyser() {
    override fun analysis(code: String, filePath: String, parseMode: ParseMode): CodeContainer {
        return when (parseMode) {
            ParseMode.Basic -> identFullInfo(code, filePath)
            ParseMode.Full -> identBasicInfo(code, filePath)
        }
    }

    open fun identFullInfo(
        str: String,
        fileName: String,
        classes: Array<String> = arrayOf(),
        basicNodes: Array<CodeDataStruct> = arrayOf()
    ): CodeContainer {
        val context = this.parse(str).compilationUnit()
        val listener = JavaFullIdentListener(fileName, classes)

        ParseTreeWalker().walk(listener, context)
        return listener.getNodeInfo()
    }

    open fun identBasicInfo(str: String, fileName: String): CodeContainer {
        val context = this.parse(str).compilationUnit()
        val listener = JavaBasicIdentListener(fileName)

        ParseTreeWalker().walk(listener, context)

        return listener.getNodeInfo()
    }

    open fun parse(str: String): JavaParser {
        val fromString = CharStreams.fromString(str)
        val lexer = JavaLexer(fromString)
        val tokenStream = CommonTokenStream(lexer)
        val parser = JavaParser(tokenStream)
        return parser
    }
}
