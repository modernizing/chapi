package chapi.domain.core

import kotlinx.serialization.Serializable

@Serializable
data class CodeField(
    var TypeType: String = "",
    var TypeValue: String = "",
    var TypeKey: String = "",
    var Annotations: Array<CodeAnnotation> = arrayOf(),
    var Modifiers: Array<String> = arrayOf(),
    // for TypeScript and JavaScript only, examples: `export default sample = createHello() `
    var Calls: Array<CodeCall> = arrayOf()
)
