package net.kigawa.renlin.tag

import net.kigawa.renlin.category.EmbeddedFlowInteractivePalpablePhrasingIntersection
import net.kigawa.renlin.category.EmbeddedFlowInteractivePalpablePhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState

/**
 * HTML <embed> element
 * 
 * Categories: FlowContent, PhrasingContent, EmbeddedContent, InteractiveContent, PalpableContent
 */
class EmbedDsl(dslState: DslState):
    DslBase<EmbeddedFlowInteractivePalpablePhrasingIntersection>(dslState), StatedDsl<EmbeddedFlowInteractivePalpablePhrasingIntersection>, EmbeddedFlowInteractivePalpablePhrasingDsl<EmbeddedFlowInteractivePalpablePhrasingIntersection> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val embed = TagComponent1<Embed, EmbedDsl>(Embed, ::EmbedDsl)

object Embed : Tag<EmbeddedFlowInteractivePalpablePhrasingIntersection> {
    override val name: String
        get() = "embed"
}