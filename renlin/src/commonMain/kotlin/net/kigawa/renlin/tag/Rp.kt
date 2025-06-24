package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowPhrasingIntersection
import net.kigawa.renlin.category.FlowPhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState

/**
 * HTML <rp> element
 * 
 * Categories: FlowContent, PhrasingContent
 */
class RpDsl(dslState: DslState):
    DslBase<FlowPhrasingIntersection>(dslState), StatedDsl<FlowPhrasingIntersection>, FlowPhrasingDsl<FlowPhrasingIntersection> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val rp = TagComponent1<Rp, RpDsl>(Rp, ::RpDsl)

object Rp : Tag<FlowPhrasingIntersection> {
    override val name: String
        get() = "rp"
}