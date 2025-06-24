package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowContent
import net.kigawa.renlin.category.FlowContentDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

class H3Dsl :
    DslBase<FlowContent>(), StatedDsl<FlowContent>, FlowContentDsl<FlowContent> {
    override fun applyElement(element: TagNode) {
    }
}

val h3 = TagComponent1<H3, H3Dsl>(H3, ::H3Dsl)

object H3 : Tag<FlowContent> {
    override val name: String
        get() = "h3"
}