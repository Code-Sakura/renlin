package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowMetadataPhrasingIntersection
import net.kigawa.renlin.category.FlowMetadataPhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <link> element
 * 
 * Categories: MetadataContent, FlowContent, PhrasingContent
 */
class LinkDsl :
    DslBase<FlowMetadataPhrasingIntersection>(), Dsl<FlowMetadataPhrasingIntersection>, FlowMetadataPhrasingDsl<FlowMetadataPhrasingIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val link = TagComponent1<Link, LinkDsl>(Link, ::LinkDsl)

object Link : Tag<FlowMetadataPhrasingIntersection> {
    override val name: String
        get() = "link"
}