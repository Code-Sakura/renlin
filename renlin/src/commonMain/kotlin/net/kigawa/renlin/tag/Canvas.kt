package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.EmbeddedFlowPalpablePhrasingUnion
import net.kigawa.renlin.w3c.category.integration.ContentCategory
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState


/**
 * HTML <canvas> element
 * 
 * model.Categories: FlowContent, PhrasingContent, EmbeddedContent, PalpableContent
 */
class CanvasDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val canvas = TagComponent1<Canvas, CanvasDsl>(Canvas, ::CanvasDsl)

object Canvas : Tag<EmbeddedFlowPalpablePhrasingUnion> {
    override val name: String
        get() = "canvas"
}