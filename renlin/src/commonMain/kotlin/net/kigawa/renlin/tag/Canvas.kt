package net.kigawa.renlin.tag

import net.kigawa.renlin.category.EmbeddedFlowPalpablePhrasingIntersection
import net.kigawa.renlin.category.EmbeddedFlowPalpablePhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <canvas> element
 * 
 * Categories: FlowContent, PhrasingContent, EmbeddedContent, PalpableContent
 */
class CanvasDsl :
    DslBase<EmbeddedFlowPalpablePhrasingIntersection>(), Dsl<EmbeddedFlowPalpablePhrasingIntersection>, EmbeddedFlowPalpablePhrasingDsl<EmbeddedFlowPalpablePhrasingIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val canvas = TagComponent1<Canvas, CanvasDsl>(Canvas, ::CanvasDsl)

object Canvas : Tag<EmbeddedFlowPalpablePhrasingIntersection> {
    override val name: String
        get() = "canvas"
}