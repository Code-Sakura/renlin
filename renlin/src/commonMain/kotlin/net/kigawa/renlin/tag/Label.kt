package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowInteractivePalpablePhrasingIntersection
import net.kigawa.renlin.category.FlowInteractivePalpablePhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <label> element
 * 
 * Categories: FlowContent, PhrasingContent, InteractiveContent, PalpableContent
 */
class LabelDsl :
    DslBase<FlowInteractivePalpablePhrasingIntersection>(), Dsl<FlowInteractivePalpablePhrasingIntersection>, FlowInteractivePalpablePhrasingDsl<FlowInteractivePalpablePhrasingIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val label = TagComponent1<Label, LabelDsl>(Label, ::LabelDsl)

object Label : Tag<FlowInteractivePalpablePhrasingIntersection> {
    override val name: String
        get() = "label"
}