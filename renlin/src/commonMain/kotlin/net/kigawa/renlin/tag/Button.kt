package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.FlowFormAssociatedInteractivePalpablePhrasing
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.ButtonCategory
import net.kigawa.renlin.w3c.category.dsl.FlowFormAssociatedInteractivePalpablePhrasingDsl


/**
 * HTML <button> element
 * 
 * model.Categories: FlowContent, PhrasingContent, InteractiveContent, PalpableContent, FormAssociatedContent
 */
class ButtonDsl(dslState: DslState): 
    DslBase<FlowFormAssociatedInteractivePalpablePhrasing>(dslState),
    StatedDsl<FlowFormAssociatedInteractivePalpablePhrasing>,
    FlowFormAssociatedInteractivePalpablePhrasingDsl<FlowFormAssociatedInteractivePalpablePhrasing> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val button = TagComponent1(Button, ::ButtonDsl)

object Button : Tag<ButtonCategory> {
    override val name: String
        get() = "button"
}