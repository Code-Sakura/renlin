package net.kigawa.renlin.css

/**
 * 単位付きの値
 */
data class CssUnit(val value: Number, val unit: String) : CssValue {
    override fun toCssString(): String = "$value$unit"
}

// 便利な拡張プロパティ
val Int.px: CssUnit get() = CssUnit(this, "px")
val Double.px: CssUnit get() = CssUnit(this, "px")
val Int.em: CssUnit get() = CssUnit(this, "em")
val Double.em: CssUnit get() = CssUnit(this, "em")
val Int.rem: CssUnit get() = CssUnit(this, "rem")
val Double.rem: CssUnit get() = CssUnit(this, "rem")
val Int.percent: CssUnit get() = CssUnit(this, "%")
val Double.percent: CssUnit get() = CssUnit(this, "%")