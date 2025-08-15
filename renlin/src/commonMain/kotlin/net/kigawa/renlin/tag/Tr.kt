package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowContent
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.TrCategory
import net.kigawa.renlin.w3c.category.dsl.FlowContentDsl


/**
 * HTML <tr> element
 * 
 * model.Categories: FlowContent
 */
class TrDsl(dslState: DslState): 
    DslBase<FlowContent>(dslState),
    StatedDsl<FlowContent>,
    FlowContentDsl<FlowContent> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val tr = TagComponent1(Tr, ::TrDsl)

object Tr : Tag<TrCategory> {
    override val name: String
        get() = "tr"
}