package chapi.ast.scalaast

import chapi.ast.antlr.ScalaBaseListener
import chapi.ast.antlr.ScalaParser
import chapi.domain.core.CodeProperty

open class ScalaAstBaseListener : ScalaBaseListener() {
    fun buildParameters(classParamClauses: ScalaParser.ClassParamClausesContext?): List<CodeProperty> {
        return classParamClauses?.classParamClause()?.flatMap { paramClauseContext ->
            paramClauseContext.classParams().classParam().map { classParamContext ->
                buildParameter(classParamContext)
            }
        } ?: emptyList()
    }

    private fun buildParameter(classParamContext: ScalaParser.ClassParamContext): CodeProperty {
        val parameter = CodeProperty(
            TypeType = classParamContext.paramType().text,
            TypeValue = classParamContext.Id().text
        )

        return parameter
    }

}
