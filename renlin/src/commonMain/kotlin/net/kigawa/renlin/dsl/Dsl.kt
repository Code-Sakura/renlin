package net.kigawa.renlin.dsl

import net.kigawa.renlin.Html
import net.kigawa.renlin.dsl.state.DslState
import net.kigawa.renlin.element.TagElement

@Html
interface Dsl {
    var key: String?
    fun subDsl(subDsl: Dsl)
    fun mountDslState(state: DslState)
}