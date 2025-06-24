package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowInteractivePalpablePhrasingIntersection
import net.kigawa.renlin.category.FlowInteractivePalpablePhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState

/**
 * HTML <label> element
 * 
 * Categories: FlowContent, PhrasingContent, InteractiveContent, PalpableContent
 */
class LabelDsl(dslState: DslState):
    DslBase<FlowInteractivePalpablePhrasingIntersection>(dslState), StatedDsl<FlowInteractivePalpablePhrasingIntersection>, FlowInteractivePalpablePhrasingDsl<FlowInteractivePalpablePhrasingIntersection> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val label = TagComponent1<Label, LabelDsl>(Label, ::LabelDsl)

object Label : Tag<FlowInteractivePalpablePhrasingIntersection> {
    override val name: String
        get() = "label"
}