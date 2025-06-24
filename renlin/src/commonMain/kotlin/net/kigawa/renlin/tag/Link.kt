package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowMetadataPhrasingIntersection
import net.kigawa.renlin.category.FlowMetadataPhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState

/**
 * HTML <link> element
 * 
 * Categories: MetadataContent, FlowContent, PhrasingContent
 */
class LinkDsl(dslState: DslState):
    DslBase<FlowMetadataPhrasingIntersection>(dslState), StatedDsl<FlowMetadataPhrasingIntersection>, FlowMetadataPhrasingDsl<FlowMetadataPhrasingIntersection> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val link = TagComponent1<Link, LinkDsl>(Link, ::LinkDsl)

object Link : Tag<FlowMetadataPhrasingIntersection> {
    override val name: String
        get() = "link"
}