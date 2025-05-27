package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowMetadataPhrasingIntersection
import net.kigawa.renlin.category.FlowMetadataPhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <meta> element
 * 
 * Categories: MetadataContent, FlowContent, PhrasingContent
 */
class MetaDsl :
    DslBase<FlowMetadataPhrasingIntersection>(), Dsl<FlowMetadataPhrasingIntersection>, FlowMetadataPhrasingDsl<FlowMetadataPhrasingIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val meta = TagComponent1<Meta, MetaDsl>(Meta, ::MetaDsl)

object Meta : Tag<FlowMetadataPhrasingIntersection> {
    override val name: String
        get() = "meta"
}