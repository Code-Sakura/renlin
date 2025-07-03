package net.kigawa.renlin.css

/**
 * 単位付きの値
 */
data class CssUnit(val value: Number, val unit: String) : CssValue {
    override fun toCssString(): String = "$value$unit"
}

// 便利な拡張プロパティ
@Suppress("unused")
val Int.px: CssUnit get() = CssUnit(this, "px")
@Suppress("unused")
val Double.px: CssUnit get() = CssUnit(this, "px")
@Suppress("unused")
val Int.em: CssUnit get() = CssUnit(this, "em")
@Suppress("unused")
val Double.em: CssUnit get() = CssUnit(this, "em")
@Suppress("unused")
val Int.rem: CssUnit get() = CssUnit(this, "rem")
@Suppress("unused")
val Double.rem: CssUnit get() = CssUnit(this, "rem")
@Suppress("unused")
val Int.percent: CssUnit get() = CssUnit(this, "%")
@Suppress("unused")
val Double.percent: CssUnit get() = CssUnit(this, "%")
@Suppress("unused")
val Int.vh: CssUnit get() = CssUnit(this, "vh")
@Suppress("unused")
val Double.vh: CssUnit get() = CssUnit(this, "vh")
@Suppress("unused")
val Int.vw: CssUnit get() = CssUnit(this, "vw")
@Suppress("unused")
val Double.vw: CssUnit get() = CssUnit(this, "vw")

// 文字列をCssValueに変換する拡張プロパティ
@Suppress("unused")
val String.cssValue: CssValue get() = CssString(this)

// 数値をCssValueに変換する拡張プロパティ
@Suppress("unused")
val Int.cssValue: CssValue get() = CssString(this.toString())
@Suppress("unused")
val Double.cssValue: CssValue get() = CssString(this.toString())