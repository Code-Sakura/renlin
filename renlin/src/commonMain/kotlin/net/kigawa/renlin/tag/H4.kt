package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowHeadingPalpableIntersection
import net.kigawa.renlin.category.FlowHeadingPalpableDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <h4> element
 * 
 * Categories: FlowContent, HeadingContent, PalpableContent
 */
class H4Dsl :
    DslBase<FlowHeadingPalpableIntersection>(), Dsl<FlowHeadingPalpableIntersection>, FlowHeadingPalpableDsl<FlowHeadingPalpableIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val h4 = TagComponent1<H4, H4Dsl>(H4, ::H4Dsl)

object H4 : Tag<FlowHeadingPalpableIntersection> {
    override val name: String
        get() = "h4"
}