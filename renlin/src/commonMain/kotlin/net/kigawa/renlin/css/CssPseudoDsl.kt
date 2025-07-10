package net.kigawa.renlin.css

import net.kigawa.renlin.Html

/**
 * 疑似クラス用のDSL
 */
@Html
@Suppress("unused")
class CssPseudoDsl {
    private val properties = mutableMapOf<String, CssValue>()

    // === Color Properties ===
    var color: CssColor?
        get() = properties["color"] as? CssColor
        set(value) { if (value != null) properties["color"] = value }

    var backgroundColor: CssColor?
        get() = properties["background-color"] as? CssColor
        set(value) { if (value != null) properties["background-color"] = value }

    // === Size Properties ===
    var width: CssValue?
        get() = properties["width"]
        set(value) { if (value != null) properties["width"] = value }

    var height: CssValue?
        get() = properties["height"]
        set(value) { if (value != null) properties["height"] = value }

    // === Font Properties ===
    var fontSize: CssValue?
        get() = properties["font-size"]
        set(value) { if (value != null) properties["font-size"] = value }

    var fontWeight: FontWeight?
        get() = properties["font-weight"] as? FontWeight
        set(value) { if (value != null) properties["font-weight"] = value }

    var fontStyle: FontStyle?
        get() = properties["font-style"] as? FontStyle
        set(value) { if (value != null) properties["font-style"] = value }

    // === Transform & Animation ===
    var transform: CssValue?
        get() = properties["transform"]
        set(value) { if (value != null) properties["transform"] = value }

    var transition: CssValue?
        get() = properties["transition"]
        set(value) { if (value != null) properties["transition"] = value }

    // === Border Properties ===
    var border: CssValue?
        get() = properties["border"]
        set(value) { if (value != null) properties["border"] = value }

    var borderColor: CssColor?
        get() = properties["border-color"] as? CssColor
        set(value) { if (value != null) properties["border-color"] = value }

    var borderWidth: CssValue?
        get() = properties["border-width"]
        set(value) { if (value != null) properties["border-width"] = value }

    var borderRadius: CssValue?
        get() = properties["border-radius"]
        set(value) { if (value != null) properties["border-radius"] = value }

    // === Layout Properties ===
    var display: Display?
        get() = properties["display"] as? Display
        set(value) { if (value != null) properties["display"] = value }

    var position: Position?
        get() = properties["position"] as? Position
        set(value) { if (value != null) properties["position"] = value }

    var top: CssValue?
        get() = properties["top"]
        set(value) { if (value != null) properties["top"] = value }

    var left: CssValue?
        get() = properties["left"]
        set(value) { if (value != null) properties["left"] = value }

    var right: CssValue?
        get() = properties["right"]
        set(value) { if (value != null) properties["right"] = value }

    var bottom: CssValue?
        get() = properties["bottom"]
        set(value) { if (value != null) properties["bottom"] = value }

    // === Visual Effects ===
    var opacity: CssValue?
        get() = properties["opacity"]
        set(value) { if (value != null) properties["opacity"] = value }

    var boxShadow: CssValue?
        get() = properties["box-shadow"]
        set(value) { if (value != null) properties["box-shadow"] = value }

    var textShadow: CssValue?
        get() = properties["text-shadow"]
        set(value) { if (value != null) properties["text-shadow"] = value }

    // === Outline Properties ===
    var outline: CssValue?
        get() = properties["outline"]
        set(value) { if (value != null) properties["outline"] = value }

    var outlineColor: CssColor?
        get() = properties["outline-color"] as? CssColor
        set(value) { if (value != null) properties["outline-color"] = value }

    var outlineWidth: CssValue?
        get() = properties["outline-width"]
        set(value) { if (value != null) properties["outline-width"] = value }

    var outlineOffset: CssValue?
        get() = properties["outline-offset"]
        set(value) { if (value != null) properties["outline-offset"] = value }

    // === Spacing Properties ===
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

    // === UI Properties ===
    var cursor: Cursor?
        get() = properties["cursor"] as? Cursor
        set(value) { if (value != null) properties["cursor"] = value }

    var userSelect: UserSelect?
        get() = properties["user-select"] as? UserSelect
        set(value) { if (value != null) properties["user-select"] = value }

    var pointerEvents: PointerEvents?
        get() = properties["pointer-events"] as? PointerEvents
        set(value) { if (value != null) properties["pointer-events"] = value }

    // === Text Properties ===
    var textAlign: TextAlign?
        get() = properties["text-align"] as? TextAlign
        set(value) { if (value != null) properties["text-align"] = value }

    var textDecoration: TextDecoration?
        get() = properties["text-decoration"] as? TextDecoration
        set(value) { if (value != null) properties["text-decoration"] = value }

    var textTransform: TextTransform?
        get() = properties["text-transform"] as? TextTransform
        set(value) { if (value != null) properties["text-transform"] = value }

    // === Helper Methods ===
    fun border(width: CssValue, style: BorderStyle, color: CssColor) {
        border = CssString("${width.toCssString()} ${style.toCssString()} ${color.toCssString()}")
    }

    fun boxShadow(offsetX: CssValue, offsetY: CssValue, blurRadius: CssValue, color: CssColor) {
        boxShadow = CssString("${offsetX.toCssString()} ${offsetY.toCssString()} ${blurRadius.toCssString()} ${color.toCssString()}")
    }

    fun boxShadow(offsetX: CssValue, offsetY: CssValue, blurRadius: CssValue, spreadRadius: CssValue, color: CssColor) {
        boxShadow = CssString("${offsetX.toCssString()} ${offsetY.toCssString()} ${blurRadius.toCssString()} ${spreadRadius.toCssString()} ${color.toCssString()}")
    }

    fun textShadow(offsetX: CssValue, offsetY: CssValue, blurRadius: CssValue, color: CssColor) {
        textShadow = CssString("${offsetX.toCssString()} ${offsetY.toCssString()} ${blurRadius.toCssString()} ${color.toCssString()}")
    }

    // 内部で使用：プロパティマップを取得
    internal fun getProperties(): Map<String, CssValue> = properties.toMap()
}