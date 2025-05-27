package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowFormAssociatedInteractivePalpablePhrasingIntersection
import net.kigawa.renlin.category.FlowFormAssociatedInteractivePalpablePhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <button> element
 * 
 * Categories: FlowContent, PhrasingContent, InteractiveContent, PalpableContent, FormAssociatedContent
 */
class ButtonDsl :
    DslBase<FlowFormAssociatedInteractivePalpablePhrasingIntersection>(), Dsl<FlowFormAssociatedInteractivePalpablePhrasingIntersection>, FlowFormAssociatedInteractivePalpablePhrasingDsl<FlowFormAssociatedInteractivePalpablePhrasingIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val button = TagComponent1<Button, ButtonDsl>(Button, ::ButtonDsl)

object Button : Tag<FlowFormAssociatedInteractivePalpablePhrasingIntersection> {
    override val name: String
        get() = "button"
}