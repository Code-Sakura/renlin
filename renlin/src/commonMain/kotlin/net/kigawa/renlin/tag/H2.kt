package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowHeadingPalpableIntersection
import net.kigawa.renlin.category.FlowHeadingPalpableDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <h2> element
 * 
 * Categories: FlowContent, HeadingContent, PalpableContent
 */
class H2Dsl :
    DslBase<FlowHeadingPalpableIntersection>(), Dsl<FlowHeadingPalpableIntersection>, FlowHeadingPalpableDsl<FlowHeadingPalpableIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val h2 = TagComponent1<H2, H2Dsl>(H2, ::H2Dsl)

object H2 : Tag<FlowHeadingPalpableIntersection> {
    override val name: String
        get() = "h2"
}