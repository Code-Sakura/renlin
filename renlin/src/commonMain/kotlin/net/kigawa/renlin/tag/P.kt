package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowContent
import net.kigawa.renlin.category.FlowContentDsl
import net.kigawa.renlin.category.PhrasingContent
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

class PDsl :
    DslBase<PhrasingContent>(), Dsl<PhrasingContent> {
    override fun applyElement(element: TagNode) {
    }
}

val p = TagComponent1<P, PDsl>(P, ::PDsl)

object P : Tag<FlowContent> {
    override val name: String
        get() = "p"
}