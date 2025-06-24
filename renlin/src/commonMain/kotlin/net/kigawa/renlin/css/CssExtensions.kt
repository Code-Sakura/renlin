package net.kigawa.renlin.css

import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.category.ContentCategory

/**
 * DSLにCSS機能を追加する拡張関数
 */
fun <CONTENT_CATEGORY : ContentCategory> Dsl<CONTENT_CATEGORY>.css(block: CssDsl.() -> Unit) {
    val cssDsl = CssDsl()
    cssDsl.block()
    val properties = cssDsl.getProperties()

    if (properties.isNotEmpty()) {
        // dslStateがnullの場合は、CSS情報を一時保存
        if (this is CssCapable) {
            this.pendingCssProperties = properties
        }
    }
}

/**
 * CSS対応可能なDSLを示すインターフェース
 */
interface CssCapable {
    var cssClassName: String?
    var pendingCssProperties: Map<String, CssValue>?
}