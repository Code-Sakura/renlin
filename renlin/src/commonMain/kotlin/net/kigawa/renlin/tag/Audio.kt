package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.EmbeddedFlowInteractivePalpablePhrasing
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.AudioCategory
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <audio> element
 * 
 * model.Categories: FlowContent, PhrasingContent, EmbeddedContent, PalpableContent, InteractiveContent
 */
class AudioDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val audio = TagComponent1(Audio, ::AudioDsl)

object Audio : Tag<AudioCategory> {
    override val name: String
        get() = "audio"
}