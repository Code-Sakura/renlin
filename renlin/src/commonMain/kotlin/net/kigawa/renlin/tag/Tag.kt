package net.kigawa.renlin.tag

import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagElement

interface Tag<DSL : Dsl> {
    val name: String
    fun newDsl(element: TagElement): DSL
}