package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowFormAssociatedInteractivePalpablePhrasingIntersection
import net.kigawa.renlin.category.FlowFormAssociatedInteractivePalpablePhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState

/**
 * HTML <button> element
 * 
 * Categories: FlowContent, PhrasingContent, InteractiveContent, PalpableContent, FormAssociatedContent
 */
class ButtonDsl(dslState: DslState):
    DslBase<FlowFormAssociatedInteractivePalpablePhrasingIntersection>(dslState), StatedDsl<FlowFormAssociatedInteractivePalpablePhrasingIntersection>, FlowFormAssociatedInteractivePalpablePhrasingDsl<FlowFormAssociatedInteractivePalpablePhrasingIntersection> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val button = TagComponent1<Button, ButtonDsl>(Button, ::ButtonDsl)

object Button : Tag<FlowFormAssociatedInteractivePalpablePhrasingIntersection> {
    override val name: String
        get() = "button"
}