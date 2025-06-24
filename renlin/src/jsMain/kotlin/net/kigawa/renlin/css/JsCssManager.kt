package net.kigawa.renlin.css

import kotlinx.browser.document
import org.w3c.dom.HTMLStyleElement

/**
 * JS版のCSSマネージャー実装
 */
class JsCssManager : CssManager {
    private val styleElement: HTMLStyleElement = document.createElement("style") as HTMLStyleElement
    private val cssClasses = mutableMapOf<String, String>() // クラス名 -> CSS文字列
    private val propertyHashToClassName = mutableMapOf<String, String>() // プロパティハッシュ -> クラス名

    init {
        styleElement.id = "renlin-css-styles"
        document.head?.appendChild(styleElement)
    }

    override fun getOrCreateClass(properties: Map<String, CssValue>): String {
        if (properties.isEmpty()) return ""

        // React風のクラス名を生成
        val className = CssUtils.generateClassName(properties)

        // 既に同じクラス名が存在する場合はそれを返す
        return if (cssClasses.containsKey(className)) {
            className
        } else {
            val cssString = CssUtils.generateCssString(properties)
            cssClasses[className] = cssString
            updateStyles()
            className
        }
    }

    override fun updateStyles() {
        val cssText = cssClasses.entries.joinToString("\n") { (className, css) ->
            ".$className { $css }"
        }
        styleElement.textContent = cssText
    }
}

/**
 * JS版のCssManagerファクトリ関数
 */
actual fun createCssManager(): CssManager = JsCssManager()