package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.EmbeddedFlowPalpablePhrasingUnion
import net.kigawa.renlin.w3c.category.integration.EmbeddedFlowPalpablePhrasingIntegration
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.dsl.EmbeddedFlowPalpablePhrasingDsl


/**
 * HTML <math> element
 * 
 * model.Categories: FlowContent, PhrasingContent, EmbeddedContent, PalpableContent
 */
class MathDsl(dslState: DslState): 
    DslBase<EmbeddedFlowPalpablePhrasingIntegration>(dslState),
    StatedDsl<EmbeddedFlowPalpablePhrasingIntegration>,
    EmbeddedFlowPalpablePhrasingDsl<EmbeddedFlowPalpablePhrasingIntegration> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val math = TagComponent1(Math, ::MathDsl)

object Math : Tag<EmbeddedFlowPalpablePhrasingUnion> {
    override val name: String
        get() = "math"
}