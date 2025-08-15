package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.FlowPhrasing
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.SlotCategory
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <slot> element
 * 
 * model.Categories: FlowContent, PhrasingContent
 */
class SlotDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val slot = TagComponent1(Slot, ::SlotDsl)

object Slot : Tag<SlotCategory> {
    override val name: String
        get() = "slot"
}