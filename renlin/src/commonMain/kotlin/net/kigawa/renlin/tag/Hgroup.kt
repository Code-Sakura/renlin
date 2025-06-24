package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowHeadingIntersection
import net.kigawa.renlin.category.FlowHeadingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState

/**
 * HTML <hgroup> element
 * 
 * Categories: FlowContent, HeadingContent
 */
class HgroupDsl(dslState: DslState):
    DslBase<FlowHeadingIntersection>(dslState), StatedDsl<FlowHeadingIntersection>, FlowHeadingDsl<FlowHeadingIntersection> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val hgroup = TagComponent1<Hgroup, HgroupDsl>(Hgroup, ::HgroupDsl)

object Hgroup : Tag<FlowHeadingIntersection> {
    override val name: String
        get() = "hgroup"
}