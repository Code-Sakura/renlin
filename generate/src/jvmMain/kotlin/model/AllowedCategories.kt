package model

data class AllowedCategories(
    override val categories: Set<String>,
    override val parentCategories: Map<String, String> = emptyMap(),
) : Categories {
    constructor(vararg categories: String) : this(categories.toSet())
    constructor(vararg categories: String, parentCategories: Map<String, String>) : this(categories.toSet(), parentCategories)
    constructor(categories: Set<String>, vararg parentCategoryPairs: Pair<String, String>) : this(categories, parentCategoryPairs.toMap())
}
