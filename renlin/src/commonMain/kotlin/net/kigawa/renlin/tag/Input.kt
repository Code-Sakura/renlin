package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowFormAssociatedInteractivePalpablePhrasingUnion
import net.kigawa.renlin.w3c.category.integration.ContentCategory
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState


/**
 * HTML <input> element
 * 
 * model.Categories: FlowContent, PhrasingContent, PalpableContent, InteractiveContent, FormAssociatedContent
 */
class InputDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val input = TagComponent1<Input, InputDsl>(Input, ::InputDsl)

object Input : Tag<FlowFormAssociatedInteractivePalpablePhrasingUnion> {
    override val name: String
        get() = "input"
}