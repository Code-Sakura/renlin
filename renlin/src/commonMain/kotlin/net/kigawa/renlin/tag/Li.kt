package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowContent
import net.kigawa.renlin.category.FlowContentDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <li> element
 * 
 * Categories: FlowContent
 */
class LiDsl :
    DslBase<FlowContent>(), StatedDsl<FlowContent>, FlowContentDsl<FlowContent> {
    override fun applyElement(element: TagNode) {
    }
}

val li = TagComponent1<Li, LiDsl>(Li, ::LiDsl)

object Li : Tag<FlowContent> {
    override val name: String
        get() = "li"
}