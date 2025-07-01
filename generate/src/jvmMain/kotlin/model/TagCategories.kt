package model

data class TagCategories(
    override val categories: Set<String>,
) : Categories {
    constructor(vararg categories: String) : this(categories.toSet())
}