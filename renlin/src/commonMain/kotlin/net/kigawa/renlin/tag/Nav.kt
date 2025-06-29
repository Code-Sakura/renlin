package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowPalpableSectioningUnion
import net.kigawa.renlin.w3c.category.integration.ContentCategory
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState


/**
 * HTML <nav> element
 * 
 * model.Categories: FlowContent, SectioningContent, PalpableContent
 */
class NavDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val nav = TagComponent1<Nav, NavDsl>(Nav, ::NavDsl)

object Nav : Tag<FlowPalpableSectioningUnion> {
    override val name: String
        get() = "nav"
}