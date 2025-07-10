package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.EmbeddedFlowPalpablePhrasingUnion
import net.kigawa.renlin.w3c.category.integration.EmbeddedFlowPalpablePhrasingIntegration
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.dsl.EmbeddedFlowPalpablePhrasingDsl


/**
 * HTML <svg> element
 * 
 * model.Categories: FlowContent, PhrasingContent, EmbeddedContent, PalpableContent
 */
class SvgDsl(dslState: DslState): 
    DslBase<EmbeddedFlowPalpablePhrasingIntegration>(dslState),
    StatedDsl<EmbeddedFlowPalpablePhrasingIntegration>,
    EmbeddedFlowPalpablePhrasingDsl<EmbeddedFlowPalpablePhrasingIntegration> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val svg = TagComponent1<Svg, SvgDsl>(Svg, ::SvgDsl)

object Svg : Tag<EmbeddedFlowPalpablePhrasingUnion> {
    override val name: String
        get() = "svg"
}