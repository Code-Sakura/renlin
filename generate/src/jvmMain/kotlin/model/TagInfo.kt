package model

data class TagInfo(
    val name: String,
    val tagCategories: TagCategories,
    val allowedCategories: AllowedCategories,
) {
    val className get() = name.replaceFirstChar { it.uppercase() }
    val escapement
        get() = when (name) {
            "object" -> "`object`"
            "var" -> "`var`"
            else -> name
        }
}