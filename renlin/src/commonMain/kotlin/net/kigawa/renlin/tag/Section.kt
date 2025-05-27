package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowPalpableSectioningIntersection
import net.kigawa.renlin.category.FlowPalpableSectioningDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <section> element
 * 
 * Categories: FlowContent, SectioningContent, PalpableContent
 */
class SectionDsl :
    DslBase<FlowPalpableSectioningIntersection>(), Dsl<FlowPalpableSectioningIntersection>, FlowPalpableSectioningDsl<FlowPalpableSectioningIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val section = TagComponent1<Section, SectionDsl>(Section, ::SectionDsl)

object Section : Tag<FlowPalpableSectioningIntersection> {
    override val name: String
        get() = "section"
}