package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowContent
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.TrackCategory
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <track> element
 * 
 * model.Categories: FlowContent
 */
class TrackDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val track = TagComponent1(Track, ::TrackDsl)

object Track : Tag<TrackCategory> {
    override val name: String
        get() = "track"
}