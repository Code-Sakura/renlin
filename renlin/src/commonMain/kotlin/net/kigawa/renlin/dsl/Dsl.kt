package net.kigawa.renlin.dsl

import net.kigawa.renlin.Html
import net.kigawa.renlin.dsl.state.DslState
import net.kigawa.renlin.element.TagElement
import net.kigawa.renlin.tag.component.Component

@Html
interface Dsl {
    var key: String?
    fun subDsl(subDsl: Dsl, component0: Component)
    fun mountDslState(state: DslState)
    fun applyElement(element: TagElement)
}