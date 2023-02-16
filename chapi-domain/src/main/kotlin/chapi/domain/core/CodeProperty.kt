package chapi.domain.core

import kotlinx.serialization.Serializable

@Serializable
data class CodeProperty(
    var Modifiers: Array<String> = arrayOf(),
    var DefaultValue: String = "",
    var TypeValue: String,
    var TypeType: String,
    var Annotations: Array<CodeAnnotation> = arrayOf(),
    // for TypeScript and Parameter
    var ObjectValue: Array<CodeProperty> = arrayOf(),
    var ReturnTypes: Array<CodeProperty> = arrayOf(),
    var Parameters: Array<CodeProperty> = arrayOf(),
)
