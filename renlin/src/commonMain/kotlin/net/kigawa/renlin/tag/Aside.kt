package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.FlowPalpableSectioningIntegration
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <aside> element
 * 
 * model.Categories: FlowContent, SectioningContent, PalpableContent
 */
class AsideDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val aside = TagComponent1(Aside, ::AsideDsl)

object Aside : Tag<FlowPalpableSectioningIntegration> {
    override val name: String
        get() = "aside"
}