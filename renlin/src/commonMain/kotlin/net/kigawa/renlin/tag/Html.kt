package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowContent
import net.kigawa.renlin.category.FlowContentDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <html> element
 * 
 * Categories: FlowContent
 */
class HtmlDsl :
    DslBase<FlowContent>(), StatedDsl<FlowContent>, FlowContentDsl<FlowContent> {
    override fun applyElement(element: TagNode) {
    }
}

val html = TagComponent1<Html, HtmlDsl>(Html, ::HtmlDsl)

object Html : Tag<FlowContent> {
    override val name: String
        get() = "html"
}