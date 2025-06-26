package net.kigawa.renlin.css

/**
 * CSS疑似クラス情報を保持するデータクラス
 */
data class PseudoClassRule(
    val pseudoClass: String,
    val properties: Map<String, CssValue>
)

/**
 * CSS規則（ベース + 疑似クラス）を管理するデータクラス
 */
data class CssRuleSet(
    val baseProperties: Map<String, CssValue>,
    val pseudoClasses: List<PseudoClassRule>
) {
    fun isEmpty(): Boolean = baseProperties.isEmpty() && pseudoClasses.isEmpty()
}

/**
 * CSSクラス管理のインターフェース
 */
interface CssManager {
    fun getOrCreateClass(ruleSet: CssRuleSet): String
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
     * CSSルールセットからReact風のクラス名を生成
     */
    fun generateClassName(ruleSet: CssRuleSet): String {
        // ベースプロパティと疑似クラスを含めた内容でハッシュ値を生成
        val baseContent = ruleSet.baseProperties.entries
            .sortedBy { it.key }
            .joinToString("|") { "${it.key}:${it.value.toCssString()}" }

        val pseudoContent = ruleSet.pseudoClasses
            .sortedBy { it.pseudoClass }
            .joinToString("|") { rule ->
                val props = rule.properties.entries
                    .sortedBy { it.key }
                    .joinToString(",") { "${it.key}:${it.value.toCssString()}" }
                "${rule.pseudoClass}($props)"
            }

        val content = listOf(baseContent, pseudoContent)
            .filter { it.isNotEmpty() }
            .joinToString("||")

        val hash = content.hashCode()
        val hashString = hash.toUInt().toString(36)

        return "renlin-$hashString"
    }

    /**
     * CSS規則セットから完全なCSS文字列を生成
     */
    fun generateFullCssString(className: String, ruleSet: CssRuleSet): String {
        val cssRules = mutableListOf<String>()

        // ベースルール
        if (ruleSet.baseProperties.isNotEmpty()) {
            val baseRule = ".$className { ${generateCssString(ruleSet.baseProperties)} }"
            cssRules.add(baseRule)
        }

        // 疑似クラスルール
        ruleSet.pseudoClasses.forEach { pseudoRule ->
            if (pseudoRule.properties.isNotEmpty()) {
                val pseudoCssRule = ".$className:${pseudoRule.pseudoClass} { ${generateCssString(pseudoRule.properties)} }"
                cssRules.add(pseudoCssRule)
            }
        }

        return cssRules.joinToString("\n")
    }
}