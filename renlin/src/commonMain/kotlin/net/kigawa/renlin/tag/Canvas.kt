package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.EmbeddedFlowPalpablePhrasing
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.CanvasCategory
import net.kigawa.renlin.w3c.category.dsl.EmbeddedFlowPalpablePhrasingDsl


/**
 * HTML <canvas> element
 * 
 * model.Categories: FlowContent, PhrasingContent, EmbeddedContent, PalpableContent
 */
class CanvasDsl(dslState: DslState): 
    DslBase<EmbeddedFlowPalpablePhrasing>(dslState),
    StatedDsl<EmbeddedFlowPalpablePhrasing>,
    EmbeddedFlowPalpablePhrasingDsl<EmbeddedFlowPalpablePhrasing> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val canvas = TagComponent1(Canvas, ::CanvasDsl)

object Canvas : Tag<CanvasCategory> {
    override val name: String
        get() = "canvas"
}