package net.kigawa.renlin.tag

import net.kigawa.renlin.category.EmbeddedFlowPalpablePhrasingIntersection
import net.kigawa.renlin.category.EmbeddedFlowPalpablePhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <picture> element
 * 
 * Categories: FlowContent, PhrasingContent, EmbeddedContent, PalpableContent
 */
class PictureDsl :
    DslBase<EmbeddedFlowPalpablePhrasingIntersection>(), Dsl<EmbeddedFlowPalpablePhrasingIntersection>, EmbeddedFlowPalpablePhrasingDsl<EmbeddedFlowPalpablePhrasingIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val picture = TagComponent1<Picture, PictureDsl>(Picture, ::PictureDsl)

object Picture : Tag<EmbeddedFlowPalpablePhrasingIntersection> {
    override val name: String
        get() = "picture"
}