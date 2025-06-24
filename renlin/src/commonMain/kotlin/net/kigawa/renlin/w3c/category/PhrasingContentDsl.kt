package net.kigawa.renlin.w3c.category

import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.text


interface PhrasingContent : ContentCategory


fun <CONTENT_CATEGORY : PhrasingContent> StatedDsl<CONTENT_CATEGORY>.t(str: String, key: String? = null) {
    text.render(this, {
        this@render.text = str
    }, key)
}
