package net.kigawa.renlin.tag

import net.kigawa.renlin.category.EmbeddedFlowPalpablePhrasingIntersection
import net.kigawa.renlin.category.EmbeddedFlowPalpablePhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <svg> element
 * 
 * Categories: FlowContent, PhrasingContent, EmbeddedContent, PalpableContent
 */
class SvgDsl :
    DslBase<EmbeddedFlowPalpablePhrasingIntersection>(), Dsl<EmbeddedFlowPalpablePhrasingIntersection>, EmbeddedFlowPalpablePhrasingDsl<EmbeddedFlowPalpablePhrasingIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val svg = TagComponent1<Svg, SvgDsl>(Svg, ::SvgDsl)

object Svg : Tag<EmbeddedFlowPalpablePhrasingIntersection> {
    override val name: String
        get() = "svg"
}