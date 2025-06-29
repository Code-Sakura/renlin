package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowHeadingUnion
import net.kigawa.renlin.w3c.category.integration.ContentCategory
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState


/**
 * HTML <hgroup> element
 * 
 * model.Categories: FlowContent, HeadingContent
 */
class HgroupDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val hgroup = TagComponent1<Hgroup, HgroupDsl>(Hgroup, ::HgroupDsl)

object Hgroup : Tag<FlowHeadingUnion> {
    override val name: String
        get() = "hgroup"
}