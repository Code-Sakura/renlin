package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.EmbeddedFlowInteractivePalpablePhrasing
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.VideoCategory
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

val video = TagComponent1(Video, ::VideoDsl)

object Video : Tag<VideoCategory> {
    override val name: String
        get() = "video"
}