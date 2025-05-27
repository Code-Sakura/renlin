package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowHeadingPalpableIntersection
import net.kigawa.renlin.category.FlowHeadingPalpableDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <h6> element
 * 
 * Categories: FlowContent, HeadingContent, PalpableContent
 */
class H6Dsl :
    DslBase<FlowHeadingPalpableIntersection>(), Dsl<FlowHeadingPalpableIntersection>, FlowHeadingPalpableDsl<FlowHeadingPalpableIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val h6 = TagComponent1<H6, H6Dsl>(H6, ::H6Dsl)

object H6 : Tag<FlowHeadingPalpableIntersection> {
    override val name: String
        get() = "h6"
}