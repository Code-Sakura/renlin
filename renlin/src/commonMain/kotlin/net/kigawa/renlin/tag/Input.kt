package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.FlowFormAssociatedInteractivePalpablePhrasing
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.InputCategory
import net.kigawa.renlin.w3c.category.dsl.FlowFormAssociatedInteractivePalpablePhrasingDsl


/**
 * HTML <input> element
 * 
 * model.Categories: FlowContent, PhrasingContent, PalpableContent, InteractiveContent, FormAssociatedContent
 */
class InputDsl(dslState: DslState): 
    DslBase<FlowFormAssociatedInteractivePalpablePhrasing>(dslState),
    StatedDsl<FlowFormAssociatedInteractivePalpablePhrasing>,
    FlowFormAssociatedInteractivePalpablePhrasingDsl<FlowFormAssociatedInteractivePalpablePhrasing> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val input = TagComponent1(Input, ::InputDsl)

object Input : Tag<InputCategory> {
    override val name: String
        get() = "input"
}