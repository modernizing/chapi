package chapi.app.analyser

import org.junit.jupiter.api.Test
import java.nio.file.Paths
import kotlin.test.assertEquals

internal class TypeScriptAnalyserAppTest {
    @Test
    fun shouldIdentifySamePackage() {
        val resource = this.javaClass.classLoader.getResource("languages/ts/api")!!
        val path = Paths.get(resource.toURI()).toFile().absolutePath

        val nodes = TypeScriptAnalyserApp().analysisNodeByPath(path)
        assertEquals(2, nodes.size)

        val sb = StringBuilder()
        nodes.forEach {
            it.Functions.forEach { func ->
                run {
                    func.FunctionCalls.forEach { call ->
                        run {
                            val nodeName = call.NodeName
                            if (!(nodeName == "axios" || nodeName.startsWith("axios."))) {
                                if (call.Parameters.isNotEmpty()) {
                                    sb.append("$nodeName -> ${call.Parameters[0].TypeValue}\n")
                                } else {
                                    sb.append("${func.Name}.$nodeName\n")
                                }
                            }
                        }
                    }
                }
            }
        }

        println(sb)
    }
}
