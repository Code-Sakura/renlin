package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowContent

import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <selectedcontent> element
 * 
 * model.Categories: FlowContent
 */
class SelectedcontentDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val selectedcontent = TagComponent1<Selectedcontent, SelectedcontentDsl>(Selectedcontent, ::SelectedcontentDsl)

object Selectedcontent : Tag<FlowContent> {
    override val name: String
        get() = "selectedcontent"
}