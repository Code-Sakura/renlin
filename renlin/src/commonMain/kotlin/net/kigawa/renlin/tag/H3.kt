package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowHeadingPalpableIntersection
import net.kigawa.renlin.category.FlowHeadingPalpableDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState

/**
 * HTML <h3> element
 * 
 * Categories: FlowContent, HeadingContent, PalpableContent
 */
class H3Dsl(dslState: DslState):
    DslBase<FlowHeadingPalpableIntersection>(dslState), StatedDsl<FlowHeadingPalpableIntersection>, FlowHeadingPalpableDsl<FlowHeadingPalpableIntersection> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val h3 = TagComponent1<H3, H3Dsl>(H3, ::H3Dsl)

object H3 : Tag<FlowHeadingPalpableIntersection> {
    override val name: String
        get() = "h3"
}