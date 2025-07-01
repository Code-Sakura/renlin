package model

interface Categories {
    val categories: Set<String>
    val parentCategories: Map<String, String>

    fun connectedStr(pluralSuffix: String = ""): String {
        // 複数のカテゴリーがある場合、交差インターフェース名を生成
        if (categories.size > 1) {
            val sortedCategories = categories.sorted()
            val interfaceName = sortedCategories.map { it.replace("Content", "") }.toSet()
            return interfaceName.joinToString("") + pluralSuffix
        }

        // 单一カテゴリーの場合
        return categories.firstOrNull() ?: "ContentCategory"
    }
}
