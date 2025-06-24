package net.kigawa.renlin.dsl

import net.kigawa.renlin.NotingContent
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.element.TagNode

class EmptyStatedDsl(dslState: DslState) : DslBase<NotingContent>(dslState), StatedDsl<NotingContent> {
    override fun applyElement(element: TagNode): () -> Unit {
        throw IllegalStateException("EmptyDsl applyElement")
    }
}