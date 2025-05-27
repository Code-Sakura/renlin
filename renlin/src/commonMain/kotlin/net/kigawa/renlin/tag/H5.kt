package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowHeadingPalpableIntersection
import net.kigawa.renlin.category.FlowHeadingPalpableDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <h5> element
 * 
 * Categories: FlowContent, HeadingContent, PalpableContent
 */
class H5Dsl :
    DslBase<FlowHeadingPalpableIntersection>(), Dsl<FlowHeadingPalpableIntersection>, FlowHeadingPalpableDsl<FlowHeadingPalpableIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val h5 = TagComponent1<H5, H5Dsl>(H5, ::H5Dsl)

object H5 : Tag<FlowHeadingPalpableIntersection> {
    override val name: String
        get() = "h5"
}