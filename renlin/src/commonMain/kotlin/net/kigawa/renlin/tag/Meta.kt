package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowMetadataPhrasingUnion
import net.kigawa.renlin.w3c.category.integration.FlowMetadataPhrasingIntegration
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.dsl.FlowMetadataPhrasingDsl


/**
 * HTML <meta> element
 * 
 * model.Categories: MetadataContent, FlowContent, PhrasingContent
 */
class MetaDsl(dslState: DslState): 
    DslBase<FlowMetadataPhrasingIntegration>(dslState),
    StatedDsl<FlowMetadataPhrasingIntegration>,
    FlowMetadataPhrasingDsl<FlowMetadataPhrasingIntegration> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val meta = TagComponent1<Meta, MetaDsl>(Meta, ::MetaDsl)

object Meta : Tag<FlowMetadataPhrasingUnion> {
    override val name: String
        get() = "meta"
}