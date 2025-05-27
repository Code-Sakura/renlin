package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowMetadataPhrasingIntersection
import net.kigawa.renlin.category.FlowMetadataPhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <noscript> element
 * 
 * Categories: MetadataContent, FlowContent, PhrasingContent
 */
class NoscriptDsl :
    DslBase<FlowMetadataPhrasingIntersection>(), Dsl<FlowMetadataPhrasingIntersection>, FlowMetadataPhrasingDsl<FlowMetadataPhrasingIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val noscript = TagComponent1<Noscript, NoscriptDsl>(Noscript, ::NoscriptDsl)

object Noscript : Tag<FlowMetadataPhrasingIntersection> {
    override val name: String
        get() = "noscript"
}