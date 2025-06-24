package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowPalpablePhrasingIntersection
import net.kigawa.renlin.category.FlowPalpablePhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState

/**
 * HTML <sup> element
 * 
 * Categories: FlowContent, PhrasingContent, PalpableContent
 */
class SupDsl(dslState: DslState):
    DslBase<FlowPalpablePhrasingIntersection>(dslState), StatedDsl<FlowPalpablePhrasingIntersection>, FlowPalpablePhrasingDsl<FlowPalpablePhrasingIntersection> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val sup = TagComponent1<Sup, SupDsl>(Sup, ::SupDsl)

object Sup : Tag<FlowPalpablePhrasingIntersection> {
    override val name: String
        get() = "sup"
}