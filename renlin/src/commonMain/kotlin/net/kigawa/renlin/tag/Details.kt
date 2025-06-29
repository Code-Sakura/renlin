package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowInteractivePalpableUnion

import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <details> element
 * 
 * model.Categories: FlowContent, InteractiveContent, PalpableContent
 */
class DetailsDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val details = TagComponent1<Details, DetailsDsl>(Details, ::DetailsDsl)

object Details : Tag<FlowInteractivePalpableUnion> {
    override val name: String
        get() = "details"
}