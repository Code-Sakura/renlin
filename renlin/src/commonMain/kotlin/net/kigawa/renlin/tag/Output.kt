package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowFormAssociatedPalpablePhrasingIntersection
import net.kigawa.renlin.category.FlowFormAssociatedPalpablePhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <output> element
 * 
 * Categories: FlowContent, PhrasingContent, PalpableContent, FormAssociatedContent
 */
class OutputDsl :
    DslBase<FlowFormAssociatedPalpablePhrasingIntersection>(), Dsl<FlowFormAssociatedPalpablePhrasingIntersection>, FlowFormAssociatedPalpablePhrasingDsl<FlowFormAssociatedPalpablePhrasingIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val output = TagComponent1<Output, OutputDsl>(Output, ::OutputDsl)

object Output : Tag<FlowFormAssociatedPalpablePhrasingIntersection> {
    override val name: String
        get() = "output"
}