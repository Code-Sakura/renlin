package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowFormAssociatedInteractivePalpablePhrasingIntersection
import net.kigawa.renlin.category.FlowFormAssociatedInteractivePalpablePhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState

/**
 * HTML <input> element
 * 
 * Categories: FlowContent, PhrasingContent, PalpableContent, InteractiveContent, FormAssociatedContent
 */
class InputDsl(dslState: DslState):
    DslBase<FlowFormAssociatedInteractivePalpablePhrasingIntersection>(dslState), StatedDsl<FlowFormAssociatedInteractivePalpablePhrasingIntersection>, FlowFormAssociatedInteractivePalpablePhrasingDsl<FlowFormAssociatedInteractivePalpablePhrasingIntersection> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val input = TagComponent1<Input, InputDsl>(Input, ::InputDsl)

object Input : Tag<FlowFormAssociatedInteractivePalpablePhrasingIntersection> {
    override val name: String
        get() = "input"
}