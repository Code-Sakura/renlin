package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowContent
import net.kigawa.renlin.w3c.category.integration.ContentCategory
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState


/**
 * HTML <dd> element
 * 
 * model.Categories: FlowContent
 */
class DdDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val dd = TagComponent1<Dd, DdDsl>(Dd, ::DdDsl)

object Dd : Tag<FlowContent> {
    override val name: String
        get() = "dd"
}