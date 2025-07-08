package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.EmbeddedFlowFormAssociatedInteractivePalpablePhrasingUnion

import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <img> element
 * 
 * model.Categories: FlowContent, PhrasingContent, EmbeddedContent, PalpableContent, FormAssociatedContent, InteractiveContent
 */
class ImgDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val img = TagComponent1<Img, ImgDsl>(Img, ::ImgDsl)

object Img : Tag<EmbeddedFlowFormAssociatedInteractivePalpablePhrasingUnion> {
    override val name: String
        get() = "img"
}