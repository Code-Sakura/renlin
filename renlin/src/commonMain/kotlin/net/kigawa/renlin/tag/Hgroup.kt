package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowHeadingIntersection
import net.kigawa.renlin.category.FlowHeadingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <hgroup> element
 * 
 * Categories: FlowContent, HeadingContent
 */
class HgroupDsl :
    DslBase<FlowHeadingIntersection>(), Dsl<FlowHeadingIntersection>, FlowHeadingDsl<FlowHeadingIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val hgroup = TagComponent1<Hgroup, HgroupDsl>(Hgroup, ::HgroupDsl)

object Hgroup : Tag<FlowHeadingIntersection> {
    override val name: String
        get() = "hgroup"
}