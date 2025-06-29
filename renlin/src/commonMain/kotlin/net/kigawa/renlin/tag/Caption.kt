package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowContent

import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.dsl.FlowContentDsl


/**
 * HTML <caption> element
 * 
 * model.Categories: FlowContent
 */
class CaptionDsl(dslState: DslState): 
    DslBase<FlowContent>(dslState),
    StatedDsl<FlowContent>,
    FlowContentDsl<FlowContent> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val caption = TagComponent1<Caption, CaptionDsl>(Caption, ::CaptionDsl)

object Caption : Tag<FlowContent> {
    override val name: String
        get() = "caption"
}