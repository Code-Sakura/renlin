package net.kigawa.renlin.css

import net.kigawa.renlin.Html

/**
 * CSS記述用のDSL（全プロパティ対応 + 疑似クラス対応）
 */
@Html
@Suppress("unused")
class CssDsl {
    private val properties = mutableMapOf<String, CssValue>()
    private val pseudoClasses = mutableListOf<PseudoClassRule>()

    // === 疑似クラスメソッド ===

    /**
     * :hover 疑似クラス
     */
    fun hover(block: CssPseudoDsl.() -> Unit) {
        val pseudoDsl = CssPseudoDsl()
        pseudoDsl.block()
        pseudoClasses.add(PseudoClassRule("hover", pseudoDsl.getProperties()))
    }

    /**
     * :focus 疑似クラス
     */
    fun focus(block: CssPseudoDsl.() -> Unit) {
        val pseudoDsl = CssPseudoDsl()
        pseudoDsl.block()
        pseudoClasses.add(PseudoClassRule("focus", pseudoDsl.getProperties()))
    }

    /**
     * :active 疑似クラス
     */
    fun active(block: CssPseudoDsl.() -> Unit) {
        val pseudoDsl = CssPseudoDsl()
        pseudoDsl.block()
        pseudoClasses.add(PseudoClassRule("active", pseudoDsl.getProperties()))
    }

    /**
     * :disabled 疑似クラス
     */
    fun disabled(block: CssPseudoDsl.() -> Unit) {
        val pseudoDsl = CssPseudoDsl()
        pseudoDsl.block()
        pseudoClasses.add(PseudoClassRule("disabled", pseudoDsl.getProperties()))
    }

    /**
     * :first-child 疑似クラス
     */
    fun firstChild(block: CssPseudoDsl.() -> Unit) {
        val pseudoDsl = CssPseudoDsl()
        pseudoDsl.block()
        pseudoClasses.add(PseudoClassRule("first-child", pseudoDsl.getProperties()))
    }

    /**
     * :last-child 疑似クラス
     */
    fun lastChild(block: CssPseudoDsl.() -> Unit) {
        val pseudoDsl = CssPseudoDsl()
        pseudoDsl.block()
        pseudoClasses.add(PseudoClassRule("last-child", pseudoDsl.getProperties()))
    }

    /**
     * :nth-child(n) 疑似クラス
     */
    fun nthChild(n: Int, block: CssPseudoDsl.() -> Unit) {
        val pseudoDsl = CssPseudoDsl()
        pseudoDsl.block()
        pseudoClasses.add(PseudoClassRule("nth-child($n)", pseudoDsl.getProperties()))
    }

    /**
     * :nth-child(odd) 疑似クラス
     */
    fun nthChildOdd(block: CssPseudoDsl.() -> Unit) {
        val pseudoDsl = CssPseudoDsl()
        pseudoDsl.block()
        pseudoClasses.add(PseudoClassRule("nth-child(odd)", pseudoDsl.getProperties()))
    }

    /**
     * :nth-child(even) 疑似クラス
     */
    fun nthChildEven(block: CssPseudoDsl.() -> Unit) {
        val pseudoDsl = CssPseudoDsl()
        pseudoDsl.block()
        pseudoClasses.add(PseudoClassRule("nth-child(even)", pseudoDsl.getProperties()))
    }

    /**
     * :visited 疑似クラス（リンク用）
     */
    fun visited(block: CssPseudoDsl.() -> Unit) {
        val pseudoDsl = CssPseudoDsl()
        pseudoDsl.block()
        pseudoClasses.add(PseudoClassRule("visited", pseudoDsl.getProperties()))
    }

    /**
     * :checked 疑似クラス（フォーム要素用）
     */
    fun checked(block: CssPseudoDsl.() -> Unit) {
        val pseudoDsl = CssPseudoDsl()
        pseudoDsl.block()
        pseudoClasses.add(PseudoClassRule("checked", pseudoDsl.getProperties()))
    }

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

    var minWidth: CssValue?
        get() = properties["min-width"]
        set(value) { if (value != null) properties["min-width"] = value }

    var minHeight: CssValue?
        get() = properties["min-height"]
        set(value) { if (value != null) properties["min-height"] = value }

    var maxWidth: CssValue?
        get() = properties["max-width"]
        set(value) { if (value != null) properties["max-width"] = value }

    var maxHeight: CssValue?
        get() = properties["max-height"]
        set(value) { if (value != null) properties["max-height"] = value }

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

    var fontVariant: FontVariant?
        get() = properties["font-variant"] as? FontVariant
        set(value) { if (value != null) properties["font-variant"] = value }

    var fontFamily: CssValue?
        get() = properties["font-family"]
        set(value) { if (value != null) properties["font-family"] = value }

    var lineHeight: CssValue?
        get() = properties["line-height"]
        set(value) { if (value != null) properties["line-height"] = value }

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

    var letterSpacing: CssValue?
        get() = properties["letter-spacing"]
        set(value) { if (value != null) properties["letter-spacing"] = value }

    var wordSpacing: CssValue?
        get() = properties["word-spacing"]
        set(value) { if (value != null) properties["word-spacing"] = value }

    var whiteSpace: WhiteSpace?
        get() = properties["white-space"] as? WhiteSpace
        set(value) { if (value != null) properties["white-space"] = value }

    var wordBreak: WordBreak?
        get() = properties["word-break"] as? WordBreak
        set(value) { if (value != null) properties["word-break"] = value }

    var textOverflow: TextOverflow?
        get() = properties["text-overflow"] as? TextOverflow
        set(value) { if (value != null) properties["text-overflow"] = value }

    // === Margin Properties ===
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

    // === Padding Properties ===
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

    // === Border Properties ===
    var border: CssValue?
        get() = properties["border"]
        set(value) { if (value != null) properties["border"] = value }

    var borderWidth: CssValue?
        get() = properties["border-width"]
        set(value) { if (value != null) properties["border-width"] = value }

    var borderStyle: BorderStyle?
        get() = properties["border-style"] as? BorderStyle
        set(value) { if (value != null) properties["border-style"] = value }

    var borderColor: CssColor?
        get() = properties["border-color"] as? CssColor
        set(value) { if (value != null) properties["border-color"] = value }

    var borderRadius: CssValue?
        get() = properties["border-radius"]
        set(value) { if (value != null) properties["border-radius"] = value }

    // Border individual sides
    var borderTop: CssValue?
        get() = properties["border-top"]
        set(value) { if (value != null) properties["border-top"] = value }

    var borderRight: CssValue?
        get() = properties["border-right"]
        set(value) { if (value != null) properties["border-right"] = value }

    var borderBottom: CssValue?
        get() = properties["border-bottom"]
        set(value) { if (value != null) properties["border-bottom"] = value }

    var borderLeft: CssValue?
        get() = properties["border-left"]
        set(value) { if (value != null) properties["border-left"] = value }

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

    var right: CssValue?
        get() = properties["right"]
        set(value) { if (value != null) properties["right"] = value }

    var bottom: CssValue?
        get() = properties["bottom"]
        set(value) { if (value != null) properties["bottom"] = value }

    var left: CssValue?
        get() = properties["left"]
        set(value) { if (value != null) properties["left"] = value }

    var zIndex: CssValue?
        get() = properties["z-index"]
        set(value) { if (value != null) properties["z-index"] = value }

    var overflow: Overflow?
        get() = properties["overflow"] as? Overflow
        set(value) { if (value != null) properties["overflow"] = value }

    var overflowX: Overflow?
        get() = properties["overflow-x"] as? Overflow
        set(value) { if (value != null) properties["overflow-x"] = value }

    var overflowY: Overflow?
        get() = properties["overflow-y"] as? Overflow
        set(value) { if (value != null) properties["overflow-y"] = value }

    var visibility: Visibility?
        get() = properties["visibility"] as? Visibility
        set(value) { if (value != null) properties["visibility"] = value }

    var float: Float?
        get() = properties["float"] as? Float
        set(value) { if (value != null) properties["float"] = value }

    var clear: Clear?
        get() = properties["clear"] as? Clear
        set(value) { if (value != null) properties["clear"] = value }

    var boxSizing: BoxSizing?
        get() = properties["box-sizing"] as? BoxSizing
        set(value) { if (value != null) properties["box-sizing"] = value }

    // === Flexbox Properties ===
    var flex: CssValue?
        get() = properties["flex"]
        set(value) { if (value != null) properties["flex"] = value }

    var flexDirection: FlexDirection?
        get() = properties["flex-direction"] as? FlexDirection
        set(value) { if (value != null) properties["flex-direction"] = value }

    var flexWrap: FlexWrap?
        get() = properties["flex-wrap"] as? FlexWrap
        set(value) { if (value != null) properties["flex-wrap"] = value }

    var justifyContent: JustifyContent?
        get() = properties["justify-content"] as? JustifyContent
        set(value) { if (value != null) properties["justify-content"] = value }

    var alignItems: AlignItems?
        get() = properties["align-items"] as? AlignItems
        set(value) { if (value != null) properties["align-items"] = value }

    var alignContent: AlignContent?
        get() = properties["align-content"] as? AlignContent
        set(value) { if (value != null) properties["align-content"] = value }

    var alignSelf: AlignSelf?
        get() = properties["align-self"] as? AlignSelf
        set(value) { if (value != null) properties["align-self"] = value }

    var flexGrow: CssValue?
        get() = properties["flex-grow"]
        set(value) { if (value != null) properties["flex-grow"] = value }

    var flexShrink: CssValue?
        get() = properties["flex-shrink"]
        set(value) { if (value != null) properties["flex-shrink"] = value }

    var flexBasis: CssValue?
        get() = properties["flex-basis"]
        set(value) { if (value != null) properties["flex-basis"] = value }

    var order: CssValue?
        get() = properties["order"]
        set(value) { if (value != null) properties["order"] = value }

    // === Grid Properties ===
    var grid: CssValue?
        get() = properties["grid"]
        set(value) { if (value != null) properties["grid"] = value }

    var gridTemplate: CssValue?
        get() = properties["grid-template"]
        set(value) { if (value != null) properties["grid-template"] = value }

    var gridTemplateColumns: CssValue?
        get() = properties["grid-template-columns"]
        set(value) { if (value != null) properties["grid-template-columns"] = value }

    var gridTemplateRows: CssValue?
        get() = properties["grid-template-rows"]
        set(value) { if (value != null) properties["grid-template-rows"] = value }

    var gridTemplateAreas: CssValue?
        get() = properties["grid-template-areas"]
        set(value) { if (value != null) properties["grid-template-areas"] = value }

    var gridColumn: CssValue?
        get() = properties["grid-column"]
        set(value) { if (value != null) properties["grid-column"] = value }

    var gridRow: CssValue?
        get() = properties["grid-row"]
        set(value) { if (value != null) properties["grid-row"] = value }

    var gridColumnStart: CssValue?
        get() = properties["grid-column-start"]
        set(value) { if (value != null) properties["grid-column-start"] = value }

    var gridColumnEnd: CssValue?
        get() = properties["grid-column-end"]
        set(value) { if (value != null) properties["grid-column-end"] = value }

    var gridRowStart: CssValue?
        get() = properties["grid-row-start"]
        set(value) { if (value != null) properties["grid-row-start"] = value }

    var gridRowEnd: CssValue?
        get() = properties["grid-row-end"]
        set(value) { if (value != null) properties["grid-row-end"] = value }

    var gridArea: CssValue?
        get() = properties["grid-area"]
        set(value) { if (value != null) properties["grid-area"] = value }

    var gridAutoFlow: GridAutoFlow?
        get() = properties["grid-auto-flow"] as? GridAutoFlow
        set(value) { if (value != null) properties["grid-auto-flow"] = value }

    var gridAutoColumns: CssValue?
        get() = properties["grid-auto-columns"]
        set(value) { if (value != null) properties["grid-auto-columns"] = value }

    var gridAutoRows: CssValue?
        get() = properties["grid-auto-rows"]
        set(value) { if (value != null) properties["grid-auto-rows"] = value }

    var gap: CssValue?
        get() = properties["gap"]
        set(value) { if (value != null) properties["gap"] = value }

    var columnGap: CssValue?
        get() = properties["column-gap"]
        set(value) { if (value != null) properties["column-gap"] = value }

    var rowGap: CssValue?
        get() = properties["row-gap"]
        set(value) { if (value != null) properties["row-gap"] = value }

    var justifyItems: JustifyItems?
        get() = properties["justify-items"] as? JustifyItems
        set(value) { if (value != null) properties["justify-items"] = value }

    var justifySelf: JustifySelf?
        get() = properties["justify-self"] as? JustifySelf
        set(value) { if (value != null) properties["justify-self"] = value }

    var placeItems: PlaceItems?
        get() = properties["place-items"] as? PlaceItems
        set(value) { if (value != null) properties["place-items"] = value }

    var placeSelf: PlaceSelf?
        get() = properties["place-self"] as? PlaceSelf
        set(value) { if (value != null) properties["place-self"] = value }

    // === Background Properties ===
    var background: CssValue?
        get() = properties["background"]
        set(value) { if (value != null) properties["background"] = value }

    var backgroundImage: CssValue?
        get() = properties["background-image"]
        set(value) { if (value != null) properties["background-image"] = value }

    var backgroundRepeat: BackgroundRepeat?
        get() = properties["background-repeat"] as? BackgroundRepeat
        set(value) { if (value != null) properties["background-repeat"] = value }

    var backgroundPosition: BackgroundPosition?
        get() = properties["background-position"] as? BackgroundPosition
        set(value) { if (value != null) properties["background-position"] = value }

    var backgroundSize: BackgroundSize?
        get() = properties["background-size"] as? BackgroundSize
        set(value) { if (value != null) properties["background-size"] = value }

    var backgroundAttachment: BackgroundAttachment?
        get() = properties["background-attachment"] as? BackgroundAttachment
        set(value) { if (value != null) properties["background-attachment"] = value }

    // === Transform & Animation Properties ===
    var transform: CssValue?
        get() = properties["transform"]
        set(value) { if (value != null) properties["transform"] = value }

    var transformOrigin: CssValue?
        get() = properties["transform-origin"]
        set(value) { if (value != null) properties["transform-origin"] = value }

    var transition: CssValue?
        get() = properties["transition"]
        set(value) { if (value != null) properties["transition"] = value }

    var transitionProperty: CssValue?
        get() = properties["transition-property"]
        set(value) { if (value != null) properties["transition-property"] = value }

    var transitionDuration: CssValue?
        get() = properties["transition-duration"]
        set(value) { if (value != null) properties["transition-duration"] = value }

    var transitionTimingFunction: CssValue?
        get() = properties["transition-timing-function"]
        set(value) { if (value != null) properties["transition-timing-function"] = value }

    var transitionDelay: CssValue?
        get() = properties["transition-delay"]
        set(value) { if (value != null) properties["transition-delay"] = value }

    var animation: CssValue?
        get() = properties["animation"]
        set(value) { if (value != null) properties["animation"] = value }

    var animationName: CssValue?
        get() = properties["animation-name"]
        set(value) { if (value != null) properties["animation-name"] = value }

    var animationDuration: CssValue?
        get() = properties["animation-duration"]
        set(value) { if (value != null) properties["animation-duration"] = value }

    var animationTimingFunction: CssValue?
        get() = properties["animation-timing-function"]
        set(value) { if (value != null) properties["animation-timing-function"] = value }

    var animationDelay: CssValue?
        get() = properties["animation-delay"]
        set(value) { if (value != null) properties["animation-delay"] = value }

    var animationIterationCount: CssValue?
        get() = properties["animation-iteration-count"]
        set(value) { if (value != null) properties["animation-iteration-count"] = value }

    var animationDirection: CssValue?
        get() = properties["animation-direction"]
        set(value) { if (value != null) properties["animation-direction"] = value }

    var animationFillMode: CssValue?
        get() = properties["animation-fill-mode"]
        set(value) { if (value != null) properties["animation-fill-mode"] = value }

    var animationPlayState: CssValue?
        get() = properties["animation-play-state"]
        set(value) { if (value != null) properties["animation-play-state"] = value }

    // === Miscellaneous Properties ===
    var opacity: CssValue?
        get() = properties["opacity"]
        set(value) { if (value != null) properties["opacity"] = value }

    var cursor: Cursor?
        get() = properties["cursor"] as? Cursor
        set(value) { if (value != null) properties["cursor"] = value }

    var userSelect: UserSelect?
        get() = properties["user-select"] as? UserSelect
        set(value) { if (value != null) properties["user-select"] = value }

    var pointerEvents: PointerEvents?
        get() = properties["pointer-events"] as? PointerEvents
        set(value) { if (value != null) properties["pointer-events"] = value }

    var boxShadow: CssValue?
        get() = properties["box-shadow"]
        set(value) { if (value != null) properties["box-shadow"] = value }

    var textShadow: CssValue?
        get() = properties["text-shadow"]
        set(value) { if (value != null) properties["text-shadow"] = value }

    var outline: CssValue?
        get() = properties["outline"]
        set(value) { if (value != null) properties["outline"] = value }

    var outlineWidth: CssValue?
        get() = properties["outline-width"]
        set(value) { if (value != null) properties["outline-width"] = value }

    var outlineStyle: CssValue?
        get() = properties["outline-style"]
        set(value) { if (value != null) properties["outline-style"] = value }

    var outlineColor: CssColor?
        get() = properties["outline-color"] as? CssColor
        set(value) { if (value != null) properties["outline-color"] = value }

    var outlineOffset: CssValue?
        get() = properties["outline-offset"]
        set(value) { if (value != null) properties["outline-offset"] = value }

    var objectFit: ObjectFit?
        get() = properties["object-fit"] as? ObjectFit
        set(value) { if (value != null) properties["object-fit"] = value }

    var objectPosition: CssValue?
        get() = properties["object-position"]
        set(value) { if (value != null) properties["object-position"] = value }

    var verticalAlign: VerticalAlign?
        get() = properties["vertical-align"] as? VerticalAlign
        set(value) { if (value != null) properties["vertical-align"] = value }

    var resize: CssValue?
        get() = properties["resize"]
        set(value) { if (value != null) properties["resize"] = value }

    var content: CssValue?
        get() = properties["content"]
        set(value) { if (value != null) properties["content"] = value }

    var listStyle: CssValue?
        get() = properties["list-style"]
        set(value) { if (value != null) properties["list-style"] = value }

    var listStyleType: CssValue?
        get() = properties["list-style-type"]
        set(value) { if (value != null) properties["list-style-type"] = value }

    var listStylePosition: CssValue?
        get() = properties["list-style-position"]
        set(value) { if (value != null) properties["list-style-position"] = value }

    var listStyleImage: CssValue?
        get() = properties["list-style-image"]
        set(value) { if (value != null) properties["list-style-image"] = value }

    // === Helper Methods ===
    fun fontFamily(value: String) {
        fontFamily = CssString("\"$value\"")
    }

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

    // 内部で使用：CSS規則セットを取得
    internal fun getRuleSet(): CssRuleSet = CssRuleSet(properties.toMap(), pseudoClasses.toList())
}