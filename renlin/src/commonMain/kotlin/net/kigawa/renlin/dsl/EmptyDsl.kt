package net.kigawa.renlin.dsl

import net.kigawa.renlin.element.TagElement

class EmptyDsl : Dsl {
    override val element: TagElement
        get() = throw IllegalArgumentException("EmptyDsl")
    override var key: String? = null
}