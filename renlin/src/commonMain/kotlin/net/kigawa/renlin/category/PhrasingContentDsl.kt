package net.kigawa.renlin.category

import net.kigawa.renlin.dsl.TagDsl
import net.kigawa.renlin.tag.text


interface PhrasingContent : ContentCategory


fun <CONTENT_CATEGORY : PhrasingContent> TagDsl<CONTENT_CATEGORY>.t(str: String) {
    text.render(this) {
        this@render.text = str
    }
}