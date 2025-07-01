package model

data class AllowedCategories(
    override val categories: Set<String>,
) : Categories {
    constructor(vararg categories: String) : this(categories.toSet())
}