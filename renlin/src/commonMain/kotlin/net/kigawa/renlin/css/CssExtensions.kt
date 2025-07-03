package net.kigawa.renlin.css

import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * DSLにCSS機能を追加する拡張関数（疑似クラス対応）
 */
fun <CONTENT_CATEGORY : ContentCategory> StatedDsl<CONTENT_CATEGORY>.css(block: CssDsl.() -> Unit) {
    val cssDsl = CssDsl()
    cssDsl.block()
    val ruleSet = cssDsl.getRuleSet()

    if (!ruleSet.isEmpty()) {
        // dslStateがnullの場合は、CSS情報を一時保存
        if (this is CssCapable) {
            this.pendingCssRuleSet = ruleSet
        }
    }
}

/**
 * CSS対応可能なDSLを示すインターフェース
 */
interface CssCapable {
    var cssClassName: String?
    var pendingCssProperties: Map<String, CssValue>?
    var pendingCssRuleSet: CssRuleSet?
}