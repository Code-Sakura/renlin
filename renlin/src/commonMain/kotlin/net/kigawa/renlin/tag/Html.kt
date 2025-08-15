package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowContent
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.HtmlCategory
import net.kigawa.renlin.w3c.category.dsl.FlowContentDsl


/**
 * HTML <html> element
 * 
 * model.Categories: FlowContent
 */
class HtmlDsl(dslState: DslState): 
    DslBase<FlowContent>(dslState),
    StatedDsl<FlowContent>,
    FlowContentDsl<FlowContent> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val html = TagComponent1(Html, ::HtmlDsl)

object Html : Tag<HtmlCategory> {
    override val name: String
        get() = "html"
}