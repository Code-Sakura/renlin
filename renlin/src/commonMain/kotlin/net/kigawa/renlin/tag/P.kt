package net.kigawa.renlin.tag

import net.kigawa.renlin.Html
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.category.PhrasingContentDsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent0
import net.kigawa.renlin.tag.item.FlowContentItem

class PDsl() : DslBase(), Dsl, PhrasingContentDsl {
    override fun applyElement(element: TagNode) {
    }

    override var textContent: String? = null
        set(value) {
            textNodeTag.render(this) {
                text = value
            }
            field = value
        }
}

@Html
val p = TagComponent0<P, PDsl>(P)

object P : Tag<PDsl>, FlowContentItem<PDsl> {
    override val name: String
        get() = "p"

    override fun newDsl(): PDsl {
        return PDsl()
    }
}
