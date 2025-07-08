package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowPalpableSectioningUnion

import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <section> element
 * 
 * model.Categories: FlowContent, SectioningContent, PalpableContent
 */
class SectionDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val section = TagComponent1<Section, SectionDsl>(Section, ::SectionDsl)

object Section : Tag<FlowPalpableSectioningUnion> {
    override val name: String
        get() = "section"
}