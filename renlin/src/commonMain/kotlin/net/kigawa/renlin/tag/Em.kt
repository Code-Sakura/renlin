package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowPalpablePhrasingIntersection
import net.kigawa.renlin.category.FlowPalpablePhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState

/**
 * HTML <em> element
 * 
 * Categories: FlowContent, PhrasingContent, PalpableContent
 */
class EmDsl(dslState: DslState):
    DslBase<FlowPalpablePhrasingIntersection>(dslState), StatedDsl<FlowPalpablePhrasingIntersection>, FlowPalpablePhrasingDsl<FlowPalpablePhrasingIntersection> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val em = TagComponent1<Em, EmDsl>(Em, ::EmDsl)

object Em : Tag<FlowPalpablePhrasingIntersection> {
    override val name: String
        get() = "em"
}