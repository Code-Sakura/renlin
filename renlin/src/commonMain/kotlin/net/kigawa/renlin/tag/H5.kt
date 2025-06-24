package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowHeadingPalpableIntersection
import net.kigawa.renlin.category.FlowHeadingPalpableDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState

/**
 * HTML <h5> element
 * 
 * Categories: FlowContent, HeadingContent, PalpableContent
 */
class H5Dsl(dslState: DslState):
    DslBase<FlowHeadingPalpableIntersection>(dslState), StatedDsl<FlowHeadingPalpableIntersection>, FlowHeadingPalpableDsl<FlowHeadingPalpableIntersection> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val h5 = TagComponent1<H5, H5Dsl>(H5, ::H5Dsl)

object H5 : Tag<FlowHeadingPalpableIntersection> {
    override val name: String
        get() = "h5"
}