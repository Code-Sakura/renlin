package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowContent
import net.kigawa.renlin.category.FlowContentDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

class BaseDsl(dslState: DslState) :
    DslBase<FlowContent>(dslState), StatedDsl<FlowContent>, FlowContentDsl<FlowContent> {
    override fun applyElement(element: TagNode): () -> Unit {
        return {}
    }
}

val base = TagComponent1<Base, BaseDsl>(Base, ::BaseDsl)

object Base : Tag<FlowContent> {
    override val name: String
        get() = "base"
}
