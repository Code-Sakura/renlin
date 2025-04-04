package net.kigawa.renlin.dsl

import net.kigawa.renlin.NotingContent
import net.kigawa.renlin.element.TagNode

class EmptyDsl : DslBase<NotingContent>(), TagDsl<NotingContent> {
    override var key: String? = null

    override fun applyElement(element: TagNode) {
        throw IllegalStateException("EmptyDsl applyElement")
    }
}