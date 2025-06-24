package net.kigawa.renlin.tag

import net.kigawa.renlin.category.EmbeddedFlowPalpablePhrasingIntersection
import net.kigawa.renlin.category.EmbeddedFlowPalpablePhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState

/**
 * HTML <math> element
 * 
 * Categories: FlowContent, PhrasingContent, EmbeddedContent, PalpableContent
 */
class MathDsl(dslState: DslState):
    DslBase<EmbeddedFlowPalpablePhrasingIntersection>(dslState), StatedDsl<EmbeddedFlowPalpablePhrasingIntersection>, EmbeddedFlowPalpablePhrasingDsl<EmbeddedFlowPalpablePhrasingIntersection> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val math = TagComponent1<Math, MathDsl>(Math, ::MathDsl)

object Math : Tag<EmbeddedFlowPalpablePhrasingIntersection> {
    override val name: String
        get() = "math"
}