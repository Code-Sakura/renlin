package net.kigawa.renlin.tag

import net.kigawa.renlin.category.EmbeddedFlowFormAssociatedInteractivePalpablePhrasingIntersection
import net.kigawa.renlin.category.EmbeddedFlowFormAssociatedInteractivePalpablePhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <img> element
 * 
 * Categories: FlowContent, PhrasingContent, EmbeddedContent, PalpableContent, FormAssociatedContent, InteractiveContent
 */
class ImgDsl :
    DslBase<EmbeddedFlowFormAssociatedInteractivePalpablePhrasingIntersection>(), Dsl<EmbeddedFlowFormAssociatedInteractivePalpablePhrasingIntersection>, EmbeddedFlowFormAssociatedInteractivePalpablePhrasingDsl<EmbeddedFlowFormAssociatedInteractivePalpablePhrasingIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val img = TagComponent1<Img, ImgDsl>(Img, ::ImgDsl)

object Img : Tag<EmbeddedFlowFormAssociatedInteractivePalpablePhrasingIntersection> {
    override val name: String
        get() = "img"
}