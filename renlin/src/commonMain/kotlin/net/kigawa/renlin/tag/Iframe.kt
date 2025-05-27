package net.kigawa.renlin.tag

import net.kigawa.renlin.category.EmbeddedFlowInteractivePalpablePhrasingIntersection
import net.kigawa.renlin.category.EmbeddedFlowInteractivePalpablePhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <iframe> element
 * 
 * Categories: FlowContent, PhrasingContent, EmbeddedContent, InteractiveContent, PalpableContent
 */
class IframeDsl :
    DslBase<EmbeddedFlowInteractivePalpablePhrasingIntersection>(), Dsl<EmbeddedFlowInteractivePalpablePhrasingIntersection>, EmbeddedFlowInteractivePalpablePhrasingDsl<EmbeddedFlowInteractivePalpablePhrasingIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val iframe = TagComponent1<Iframe, IframeDsl>(Iframe, ::IframeDsl)

object Iframe : Tag<EmbeddedFlowInteractivePalpablePhrasingIntersection> {
    override val name: String
        get() = "iframe"
}