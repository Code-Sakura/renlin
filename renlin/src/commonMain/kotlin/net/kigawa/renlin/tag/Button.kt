package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowFormAssociatedInteractivePalpablePhrasingUnion
import net.kigawa.renlin.w3c.category.integration.ContentCategory
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState


/**
 * HTML <button> element
 * 
 * model.Categories: FlowContent, PhrasingContent, InteractiveContent, PalpableContent, FormAssociatedContent
 */
class ButtonDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val button = TagComponent1<Button, ButtonDsl>(Button, ::ButtonDsl)

object Button : Tag<FlowFormAssociatedInteractivePalpablePhrasingUnion> {
    override val name: String
        get() = "button"
}