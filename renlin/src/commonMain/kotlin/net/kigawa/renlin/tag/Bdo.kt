package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowPalpablePhrasingIntersection
import net.kigawa.renlin.category.FlowPalpablePhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState

/**
 * HTML <bdo> element
 * 
 * Categories: FlowContent, PhrasingContent, PalpableContent
 */
class BdoDsl(dslState: DslState):
    DslBase<FlowPalpablePhrasingIntersection>(dslState), StatedDsl<FlowPalpablePhrasingIntersection>, FlowPalpablePhrasingDsl<FlowPalpablePhrasingIntersection> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val bdo = TagComponent1<Bdo, BdoDsl>(Bdo, ::BdoDsl)

object Bdo : Tag<FlowPalpablePhrasingIntersection> {
    override val name: String
        get() = "bdo"
}