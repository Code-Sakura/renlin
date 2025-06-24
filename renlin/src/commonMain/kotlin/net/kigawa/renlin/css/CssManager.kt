package net.kigawa.renlin.css

/**
 * CSSクラス管理のインターフェース
 */
interface CssManager {
    fun getOrCreateClass(properties: Map<String, CssValue>): String
    fun updateStyles()
}

/**
 * プラットフォーム固有のCssManagerを作成するファクトリ関数
 */
expect fun createCssManager(): CssManager

/**
 * CSS管理のユーティリティ関数
 */
object CssUtils {
    fun generateCssString(properties: Map<String, CssValue>): String {
        return properties.entries.joinToString("; ") { (key, value) ->
            "$key: ${value.toCssString()}"
        }
    }

    /**
     * CSSプロパティからReact風のクラス名を生成
     */
    fun generateClassName(properties: Map<String, CssValue>): String {
        // プロパティの内容からハッシュ値を生成
        val content = properties.entries
            .sortedBy { it.key } // 順序を固定化
            .joinToString("|") { "${it.key}:${it.value.toCssString()}" }

        val hash = content.hashCode()

        // 負の値も正の値として扱い、36進数で短縮
        return "renlin-" + hash.toUInt().toString(36)
    }
}