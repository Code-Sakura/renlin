package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowMetadataPhrasingUnion
import net.kigawa.renlin.w3c.category.integration.ContentCategory
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState


/**
 * HTML <meta> element
 * 
 * model.Categories: MetadataContent, FlowContent, PhrasingContent
 */
class MetaDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val meta = TagComponent1<Meta, MetaDsl>(Meta, ::MetaDsl)

object Meta : Tag<FlowMetadataPhrasingUnion> {
    override val name: String
        get() = "meta"
}