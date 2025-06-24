package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowMetadataPhrasingIntersection
import net.kigawa.renlin.category.FlowMetadataPhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState

/**
 * HTML <noscript> element
 * 
 * Categories: MetadataContent, FlowContent, PhrasingContent
 */
class NoscriptDsl(dslState: DslState):
    DslBase<FlowMetadataPhrasingIntersection>(dslState), StatedDsl<FlowMetadataPhrasingIntersection>, FlowMetadataPhrasingDsl<FlowMetadataPhrasingIntersection> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val noscript = TagComponent1<Noscript, NoscriptDsl>(Noscript, ::NoscriptDsl)

object Noscript : Tag<FlowMetadataPhrasingIntersection> {
    override val name: String
        get() = "noscript"
}