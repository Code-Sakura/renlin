package net.kigawa.renlin.tag

import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.category.FlowContent
import net.kigawa.renlin.w3c.category.PhrasingContent

class PDsl(dslState: DslState) :
    DslBase<PhrasingContent>(dslState), StatedDsl<PhrasingContent> {
    override fun applyElement(element: TagNode): () -> Unit {
        return {}
    }
}

val p = TagComponent1<P, PDsl>(P, ::PDsl)

object P : Tag<FlowContent> {
    override val name: String
        get() = "p"
}