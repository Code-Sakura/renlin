package net.kigawa.renlin.css

/**
 * JVM版のCSSマネージャー実装（疑似クラス対応）
 */
class JvmCssManager : CssManager {
    private val cssRules = mutableMapOf<String, String>() // クラス名 -> 完全なCSS文字列

    override fun getOrCreateClass(ruleSet: CssRuleSet): String {
        if (ruleSet.isEmpty()) return ""

        // React風のクラス名を生成
        val className = CssUtils.generateClassName(ruleSet)

        // 既に同じクラス名が存在する場合はそれを返す
        return if (cssRules.containsKey(className)) {
            className
        } else {
            val cssString = CssUtils.generateFullCssString(className, ruleSet)
            cssRules[className] = cssString
            updateStyles()
            className
        }
    }

    override fun updateStyles() {
        // JVM版では何もしない（HTMLファイル生成時にまとめて出力）
    }

    /**
     * スタイルタグを生成
     */
    fun generateStyleTag(): String {
        return if (cssRules.isEmpty()) {
            ""
        } else {
            "<style>\n${cssRules.values.joinToString("\n")}\n</style>"
        }
    }

    /**
     * HTMLにスタイルを埋め込んだ完全なHTMLを生成
     */
    fun generateHtmlWithStyles(htmlContent: String): String {
        val styleTag = generateStyleTag()
        return if (styleTag.isNotEmpty()) {
            """
            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="UTF-8">
                $styleTag
            </head>
            <body>
                $htmlContent
            </body>
            </html>
            """.trimIndent()
        } else {
            """
            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="UTF-8">
            </head>
            <body>
                $htmlContent
            </body>
            </html>
            """.trimIndent()
        }
    }
}

/**
 * JVM版のCssManagerファクトリ関数
 */
actual fun createCssManager(): CssManager = JvmCssManager()