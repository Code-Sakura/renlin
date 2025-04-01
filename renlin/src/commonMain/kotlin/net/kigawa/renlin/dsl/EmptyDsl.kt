package net.kigawa.renlin.dsl

import net.kigawa.renlin.element.TagElement

class EmptyDsl : DslBase(), Dsl {
    override var key: String? = null

    override fun applyElement(element: TagElement) {
        throw IllegalStateException("EmptyDsl applyElement")
    }
}