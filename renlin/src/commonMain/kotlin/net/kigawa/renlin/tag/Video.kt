package net.kigawa.renlin.tag

import net.kigawa.renlin.category.EmbeddedFlowInteractivePalpablePhrasingIntersection
import net.kigawa.renlin.category.EmbeddedFlowInteractivePalpablePhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <video> element
 * 
 * Categories: FlowContent, PhrasingContent, EmbeddedContent, PalpableContent, InteractiveContent
 */
class VideoDsl :
    DslBase<EmbeddedFlowInteractivePalpablePhrasingIntersection>(), Dsl<EmbeddedFlowInteractivePalpablePhrasingIntersection>, EmbeddedFlowInteractivePalpablePhrasingDsl<EmbeddedFlowInteractivePalpablePhrasingIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val video = TagComponent1<Video, VideoDsl>(Video, ::VideoDsl)

object Video : Tag<EmbeddedFlowInteractivePalpablePhrasingIntersection> {
    override val name: String
        get() = "video"
}