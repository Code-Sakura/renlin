package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowPalpablePhrasingIntersection
import net.kigawa.renlin.category.FlowPalpablePhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState

/**
 * HTML <mark> element
 * 
 * Categories: FlowContent, PhrasingContent, PalpableContent
 */
class MarkDsl(dslState: DslState):
    DslBase<FlowPalpablePhrasingIntersection>(dslState), StatedDsl<FlowPalpablePhrasingIntersection>, FlowPalpablePhrasingDsl<FlowPalpablePhrasingIntersection> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val mark = TagComponent1<Mark, MarkDsl>(Mark, ::MarkDsl)

object Mark : Tag<FlowPalpablePhrasingIntersection> {
    override val name: String
        get() = "mark"
}