package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.FlowMetadataPhrasingIntegration
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.dsl.FlowMetadataPhrasingDsl


/**
 * HTML <noscript> element
 * 
 * model.Categories: MetadataContent, FlowContent, PhrasingContent
 */
class NoscriptDsl(dslState: DslState): 
    DslBase<FlowMetadataPhrasingIntegration>(dslState),
    StatedDsl<FlowMetadataPhrasingIntegration>,
    FlowMetadataPhrasingDsl<FlowMetadataPhrasingIntegration> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val noscript = TagComponent1(Noscript, ::NoscriptDsl)

object Noscript : Tag<FlowMetadataPhrasingIntegration> {
    override val name: String
        get() = "noscript"
}