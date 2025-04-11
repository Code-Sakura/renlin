package net.kigawa.renlin.category

import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.tag.text


interface PhrasingContent : ContentCategory


fun <CONTENT_CATEGORY : PhrasingContent> Dsl<CONTENT_CATEGORY>.t(str: String) {
    text.render(this) {
        this@render.text = str
    }
}