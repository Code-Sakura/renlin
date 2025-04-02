package net.kigawa.renlin.dsl

import net.kigawa.renlin.element.TagNode

class EmptyDsl : DslBase(), Dsl {
    override var key: String? = null

    override fun applyElement(element: TagNode) {
        throw IllegalStateException("EmptyDsl applyElement")
    }
}