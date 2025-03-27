package net.kigawa.renlin.dsl

import net.kigawa.renlin.element.TagElement

abstract class DslBase(
    override val element: TagElement,
) : Dsl {
    override var key: String? = null
}