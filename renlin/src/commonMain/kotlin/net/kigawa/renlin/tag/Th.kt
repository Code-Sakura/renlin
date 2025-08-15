package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowContent
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.ThCategory
import net.kigawa.renlin.w3c.category.dsl.FlowContentDsl


/**
 * HTML <th> element
 * 
 * model.Categories: FlowContent
 */
class ThDsl(dslState: DslState): 
    DslBase<FlowContent>(dslState),
    StatedDsl<FlowContent>,
    FlowContentDsl<FlowContent> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val th = TagComponent1(Th, ::ThDsl)

object Th : Tag<ThCategory> {
    override val name: String
        get() = "th"
}