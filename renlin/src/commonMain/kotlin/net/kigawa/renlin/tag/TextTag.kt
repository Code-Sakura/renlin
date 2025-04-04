package net.kigawa.renlin.tag

import net.kigawa.renlin.NotingContent
import net.kigawa.renlin.category.PhrasingContent
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

class TextDsl : DslBase<NotingContent>(), Dsl<NotingContent> {
    var text: String? = null
        set(value) {
            dslState?.applyDsl(this)
            field = value
        }

    operator fun String.unaryPlus() {
        text = this
    }

    override fun applyElement(element: TagNode) {
        element.setTextContent(text)
    }
}

val text = TagComponent1<TextTag, TextDsl>(TextTag, ::TextDsl)

object TextTag : Tag<PhrasingContent> {
    override val name: String
        get() = "TextNodeTag"
}
