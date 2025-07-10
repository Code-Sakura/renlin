package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.EmbeddedFlowInteractivePalpablePhrasingUnion

import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <video> element
 * 
 * model.Categories: FlowContent, PhrasingContent, EmbeddedContent, PalpableContent, InteractiveContent
 */
class VideoDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val video = TagComponent1<Video, VideoDsl>(Video, ::VideoDsl)

object Video : Tag<EmbeddedFlowInteractivePalpablePhrasingUnion> {
    override val name: String
        get() = "video"
}