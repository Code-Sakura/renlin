package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowContent
import net.kigawa.renlin.category.FlowContentDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

class FooterDsl :
    DslBase<FlowContent>(), Dsl<FlowContent>, FlowContentDsl<FlowContent> {
    override fun applyElement(element: TagNode) {
    }
}

val footer = TagComponent1<Footer, FooterDsl>(Footer, ::FooterDsl)

object Footer : Tag<FlowContent> {
    override val name: String
        get() = "footer"
}