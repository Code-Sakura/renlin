package net.kigawa.renlin.tag.component

import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.tag.Tag

interface Component1<TAG : Tag<*>, DSL : Dsl, T> {
    fun render(arg1: T, block: DSL.(arg1: T) -> Unit)
}