package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowHeadingPalpableIntersection
import net.kigawa.renlin.category.FlowHeadingPalpableDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState

/**
 * HTML <h4> element
 * 
 * Categories: FlowContent, HeadingContent, PalpableContent
 */
class H4Dsl(dslState: DslState):
    DslBase<FlowHeadingPalpableIntersection>(dslState), StatedDsl<FlowHeadingPalpableIntersection>, FlowHeadingPalpableDsl<FlowHeadingPalpableIntersection> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val h4 = TagComponent1<H4, H4Dsl>(H4, ::H4Dsl)

object H4 : Tag<FlowHeadingPalpableIntersection> {
    override val name: String
        get() = "h4"
}