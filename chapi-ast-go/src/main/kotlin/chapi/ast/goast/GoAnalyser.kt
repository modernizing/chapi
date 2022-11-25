package chapi.ast.goast

import chapi.ast.antlr.GoLexer
import chapi.ast.antlr.GoParser
import chapi.domain.core.CodeContainer
import chapi.parser.Analyser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker

open class GoAnalyser: Analyser {
    override fun analysis(code: String, filePath: String): CodeContainer {
        val context = this.parse(code).sourceFile()
        val listener = GoFullIdentListener(fileName = filePath)

        ParseTreeWalker().walk(listener, context)

        val nodeInfo = listener.getNodeInfo()
        return nodeInfo
    }

    open fun parse(str: String): GoParser {
        val fromString = CharStreams.fromString(str)
        val lexer = GoLexer (fromString)
        val tokenStream = CommonTokenStream(lexer)
        return GoParser(tokenStream)
    }
}
