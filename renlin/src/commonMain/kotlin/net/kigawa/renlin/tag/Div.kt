package net.kigawa.renlin.tag

import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.category.FlowContentDsl
import net.kigawa.renlin.dsl.category.PhrasingContentDsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent0
import net.kigawa.renlin.tag.item.FlowContentItem

class DivDsl : DslBase(), Dsl, FlowContentDsl, PhrasingContentDsl {
    override fun applyElement(element: TagNode) {
    }

    override var textContent: String? = null
        set(value) {
            text.render(this) {
                text = value
            }
            field = value
        }
}

val div = TagComponent0<Div, DivDsl>(Div)

object Div : FlowContentItem<DivDsl>, Tag<DivDsl> {
    override val name: String
        get() = "div"

    override fun newDsl(): DivDsl {
        return DivDsl()
    }
}
