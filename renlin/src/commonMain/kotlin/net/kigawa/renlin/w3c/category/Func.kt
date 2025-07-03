package net.kigawa.renlin.w3c.category

import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.text
import net.kigawa.renlin.w3c.category.native.PhrasingContent


fun <CONTENT_CATEGORY : PhrasingContent> StatedDsl<CONTENT_CATEGORY>.t(str: String, key: String? = null) {
    text.render(this, {
        this@render.text = str
    }, key)
}
