package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowContent

import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <dialog> element
 * 
 * model.Categories: FlowContent
 */
class DialogDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val dialog = TagComponent1<Dialog, DialogDsl>(Dialog, ::DialogDsl)

object Dialog : Tag<FlowContent> {
    override val name: String
        get() = "dialog"
}