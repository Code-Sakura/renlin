package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.EmbeddedFlowPalpablePhrasing
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.PictureCategory
import net.kigawa.renlin.w3c.category.dsl.EmbeddedFlowPalpablePhrasingDsl


/**
 * HTML <picture> element
 * 
 * model.Categories: FlowContent, PhrasingContent, EmbeddedContent, PalpableContent
 */
class PictureDsl(dslState: DslState): 
    DslBase<EmbeddedFlowPalpablePhrasing>(dslState),
    StatedDsl<EmbeddedFlowPalpablePhrasing>,
    EmbeddedFlowPalpablePhrasingDsl<EmbeddedFlowPalpablePhrasing> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val picture = TagComponent1(Picture, ::PictureDsl)

object Picture : Tag<PictureCategory> {
    override val name: String
        get() = "picture"
}