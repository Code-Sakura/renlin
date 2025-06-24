package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowPalpableSectioningIntersection
import net.kigawa.renlin.category.FlowPalpableSectioningDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState

/**
 * HTML <aside> element
 * 
 * Categories: FlowContent, SectioningContent, PalpableContent
 */
class AsideDsl(dslState: DslState):
    DslBase<FlowPalpableSectioningIntersection>(dslState), StatedDsl<FlowPalpableSectioningIntersection>, FlowPalpableSectioningDsl<FlowPalpableSectioningIntersection> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val aside = TagComponent1<Aside, AsideDsl>(Aside, ::AsideDsl)

object Aside : Tag<FlowPalpableSectioningIntersection> {
    override val name: String
        get() = "aside"
}