package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowContent
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.FencedframeCategory
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <fencedframe> element
 * 
 * model.Categories: FlowContent
 */
class FencedframeDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val fencedframe = TagComponent1(Fencedframe, ::FencedframeDsl)

object Fencedframe : Tag<FencedframeCategory> {
    override val name: String
        get() = "fencedframe"
}