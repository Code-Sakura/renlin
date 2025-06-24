package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowFormAssociatedPalpablePhrasingIntersection
import net.kigawa.renlin.category.FlowFormAssociatedPalpablePhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState

/**
 * HTML <output> element
 * 
 * Categories: FlowContent, PhrasingContent, PalpableContent, FormAssociatedContent
 */
class OutputDsl(dslState: DslState):
    DslBase<FlowFormAssociatedPalpablePhrasingIntersection>(dslState), StatedDsl<FlowFormAssociatedPalpablePhrasingIntersection>, FlowFormAssociatedPalpablePhrasingDsl<FlowFormAssociatedPalpablePhrasingIntersection> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val output = TagComponent1<Output, OutputDsl>(Output, ::OutputDsl)

object Output : Tag<FlowFormAssociatedPalpablePhrasingIntersection> {
    override val name: String
        get() = "output"
}