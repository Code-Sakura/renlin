package net.kigawa.renlin.css

import net.kigawa.renlin.Html

/**
 * CSS記述用のDSL（基本プロパティのみ）
 */
@Html
@Suppress("unused")
class CssDsl {
    private val properties = mutableMapOf<String, CssValue>()

    // Color
    var color: CssColor?
        get() = properties["color"] as? CssColor
        set(value) { if (value != null) properties["color"] = value }

    var backgroundColor: CssColor?
        get() = properties["background-color"] as? CssColor
        set(value) { if (value != null) properties["background-color"] = value }

    // Size
    var width: CssValue?
        get() = properties["width"]
        set(value) { if (value != null) properties["width"] = value }

    var height: CssValue?
        get() = properties["height"]
        set(value) { if (value != null) properties["height"] = value }

    // Font
    var fontSize: CssValue?
        get() = properties["font-size"]
        set(value) { if (value != null) properties["font-size"] = value }

    // Margin
    var margin: CssValue?
        get() = properties["margin"]
        set(value) { if (value != null) properties["margin"] = value }

    var marginTop: CssValue?
        get() = properties["margin-top"]
        set(value) { if (value != null) properties["margin-top"] = value }

    var marginRight: CssValue?
        get() = properties["margin-right"]
        set(value) { if (value != null) properties["margin-right"] = value }

    var marginBottom: CssValue?
        get() = properties["margin-bottom"]
        set(value) { if (value != null) properties["margin-bottom"] = value }

    var marginLeft: CssValue?
        get() = properties["margin-left"]
        set(value) { if (value != null) properties["margin-left"] = value }

    // Padding
    var padding: CssValue?
        get() = properties["padding"]
        set(value) { if (value != null) properties["padding"] = value }

    var paddingTop: CssValue?
        get() = properties["padding-top"]
        set(value) { if (value != null) properties["padding-top"] = value }

    var paddingRight: CssValue?
        get() = properties["padding-right"]
        set(value) { if (value != null) properties["padding-right"] = value }

    var paddingBottom: CssValue?
        get() = properties["padding-bottom"]
        set(value) { if (value != null) properties["padding-bottom"] = value }

    var paddingLeft: CssValue?
        get() = properties["padding-left"]
        set(value) { if (value != null) properties["padding-left"] = value }

    // 内部で使用：プロパティマップを取得
    internal fun getProperties(): Map<String, CssValue> = properties.toMap()
}