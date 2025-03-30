package net.kigawa.renlin.tag

import net.kigawa.renlin.dsl.Dsl

interface Tag<DSL : Dsl> {
    val name: String
    fun newDsl(): DSL
}