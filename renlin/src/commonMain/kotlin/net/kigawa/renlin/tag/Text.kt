package net.kigawa.renlin.tag

import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent0
import net.kigawa.renlin.category.FlowContentItem

class TextNodeTagDsl : DslBase(), Dsl {
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

val text = TagComponent0<TextNodeTag, TextNodeTagDsl>(TextNodeTag)

object TextNodeTag : FlowContentItem<TextNodeTagDsl>, Tag<TextNodeTagDsl> {
    override val name: String
        get() = "TextNodeTag"

    override fun newDsl(): TextNodeTagDsl {
        return TextNodeTagDsl()
    }
}
