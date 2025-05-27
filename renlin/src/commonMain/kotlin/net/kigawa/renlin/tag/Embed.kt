package net.kigawa.renlin.tag

import net.kigawa.renlin.category.EmbeddedFlowInteractivePalpablePhrasingIntersection
import net.kigawa.renlin.category.EmbeddedFlowInteractivePalpablePhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <embed> element
 * 
 * Categories: FlowContent, PhrasingContent, EmbeddedContent, InteractiveContent, PalpableContent
 */
class EmbedDsl :
    DslBase<EmbeddedFlowInteractivePalpablePhrasingIntersection>(), Dsl<EmbeddedFlowInteractivePalpablePhrasingIntersection>, EmbeddedFlowInteractivePalpablePhrasingDsl<EmbeddedFlowInteractivePalpablePhrasingIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val embed = TagComponent1<Embed, EmbedDsl>(Embed, ::EmbedDsl)

object Embed : Tag<EmbeddedFlowInteractivePalpablePhrasingIntersection> {
    override val name: String
        get() = "embed"
}