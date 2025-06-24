package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowInteractivePalpableIntersection
import net.kigawa.renlin.category.FlowInteractivePalpableDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState

/**
 * HTML <details> element
 * 
 * Categories: FlowContent, InteractiveContent, PalpableContent
 */
class DetailsDsl(dslState: DslState):
    DslBase<FlowInteractivePalpableIntersection>(dslState), StatedDsl<FlowInteractivePalpableIntersection>, FlowInteractivePalpableDsl<FlowInteractivePalpableIntersection> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val details = TagComponent1<Details, DetailsDsl>(Details, ::DetailsDsl)

object Details : Tag<FlowInteractivePalpableIntersection> {
    override val name: String
        get() = "details"
}