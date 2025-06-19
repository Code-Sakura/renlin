package net.kigawa.renlin.dsl

import net.kigawa.renlin.NotingContent
import net.kigawa.renlin.w3c.element.TagNode

class EmptyDsl : DslBase<NotingContent>(), Dsl<NotingContent> {
    override var key: String? = null

    override fun applyElement(element: TagNode) {
        throw IllegalStateException("EmptyDsl applyElement")
    }
}