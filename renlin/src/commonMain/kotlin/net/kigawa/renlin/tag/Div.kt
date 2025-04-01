package net.kigawa.renlin.tag

import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.category.FlowContentDsl
import net.kigawa.renlin.dsl.category.PalpableContentDsl
import net.kigawa.renlin.element.TagElement
import net.kigawa.renlin.tag.component.TagComponent0
import net.kigawa.renlin.tag.item.FlowContentItem

class DivDsl : DslBase(), Dsl, FlowContentDsl, PalpableContentDsl {
    override fun applyElement(element: TagElement) {
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
