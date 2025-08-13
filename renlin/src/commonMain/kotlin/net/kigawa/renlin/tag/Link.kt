package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowMetadataPhrasingUnion
import net.kigawa.renlin.w3c.category.integration.FlowMetadataPhrasingIntegration
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.dsl.FlowMetadataPhrasingDsl


/**
 * HTML <link> element
 * 
 * model.Categories: MetadataContent, FlowContent, PhrasingContent
 */
class LinkDsl(dslState: DslState): 
    DslBase<FlowMetadataPhrasingIntegration>(dslState),
    StatedDsl<FlowMetadataPhrasingIntegration>,
    FlowMetadataPhrasingDsl<FlowMetadataPhrasingIntegration> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val link = TagComponent1(Link, ::LinkDsl)

object Link : Tag<FlowMetadataPhrasingUnion> {
    override val name: String
        get() = "link"
}