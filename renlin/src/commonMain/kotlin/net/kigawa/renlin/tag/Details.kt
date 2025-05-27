package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowInteractivePalpableIntersection
import net.kigawa.renlin.category.FlowInteractivePalpableDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <details> element
 * 
 * Categories: FlowContent, InteractiveContent, PalpableContent
 */
class DetailsDsl :
    DslBase<FlowInteractivePalpableIntersection>(), Dsl<FlowInteractivePalpableIntersection>, FlowInteractivePalpableDsl<FlowInteractivePalpableIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val details = TagComponent1<Details, DetailsDsl>(Details, ::DetailsDsl)

object Details : Tag<FlowInteractivePalpableIntersection> {
    override val name: String
        get() = "details"
}