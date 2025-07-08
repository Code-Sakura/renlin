package net.kigawa.renlin.tag

import net.kigawa.renlin.NotingContent
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.w3c.category.native.PhrasingContent

import net.kigawa.renlin.w3c.element.TagNode

class TextDsl(dslState: DslState) : DslBase<NotingContent>(dslState), StatedDsl<NotingContent> {
    var text: String? = null
    var margin: String? = null

    operator fun String.unaryPlus() {
        text = this
    }

    override fun applyElement(element: TagNode): () -> Unit {
        element.setTextContent(text)
        return {}
    }
}

val text = TagComponent1<TextTag, TextDsl>(TextTag, ::TextDsl)

object TextTag : Tag<PhrasingContent> {
    override val name: String
        get() = "TextNodeTag"
}
