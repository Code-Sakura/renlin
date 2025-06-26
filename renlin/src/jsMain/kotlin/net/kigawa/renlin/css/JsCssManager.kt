package net.kigawa.renlin.css

import kotlinx.browser.document
import org.w3c.dom.HTMLStyleElement

class JsCssManager : CssManager {
    private val styleElement: HTMLStyleElement = document.createElement("style") as HTMLStyleElement
    private val cssRules = mutableMapOf<String, String>()

    init {
        styleElement.id = "renlin-css-styles"
        document.head?.appendChild(styleElement)
    }

    override fun getOrCreateClass(ruleSet: CssRuleSet): String {
        if (ruleSet.isEmpty()) return ""

        val className = CssUtils.generateClassName(ruleSet)

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
        val cssText = cssRules.values.joinToString("\n")
        styleElement.textContent = cssText
    }
}

actual fun createCssManager(): CssManager = JsCssManager()