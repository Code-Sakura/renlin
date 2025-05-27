package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowPalpableIntersection
import net.kigawa.renlin.category.FlowPalpableDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <div> element
 * 
 * Categories: FlowContent, PalpableContent
 */
class DivDsl :
    DslBase<FlowPalpableIntersection>(), Dsl<FlowPalpableIntersection>, FlowPalpableDsl<FlowPalpableIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val div = TagComponent1<Div, DivDsl>(Div, ::DivDsl)

object Div : Tag<FlowPalpableIntersection> {
    override val name: String
        get() = "div"
}