package net.kigawa.renlin.tag

import net.kigawa.renlin.category.EmbeddedFlowPalpablePhrasingIntersection
import net.kigawa.renlin.category.EmbeddedFlowPalpablePhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState

/**
 * HTML <svg> element
 * 
 * Categories: FlowContent, PhrasingContent, EmbeddedContent, PalpableContent
 */
class SvgDsl(dslState: DslState):
    DslBase<EmbeddedFlowPalpablePhrasingIntersection>(dslState), StatedDsl<EmbeddedFlowPalpablePhrasingIntersection>, EmbeddedFlowPalpablePhrasingDsl<EmbeddedFlowPalpablePhrasingIntersection> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val svg = TagComponent1<Svg, SvgDsl>(Svg, ::SvgDsl)

object Svg : Tag<EmbeddedFlowPalpablePhrasingIntersection> {
    override val name: String
        get() = "svg"
}