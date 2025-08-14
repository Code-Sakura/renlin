package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.FlowPalpableSectioningIntegration
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.ContentCategory

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

val nav = TagComponent1(Nav, ::NavDsl)

object Nav : Tag<FlowPalpableSectioningIntegration> {
    override val name: String
        get() = "nav"
}