package net.kigawa.renlin.dsl

import net.kigawa.renlin.Html
import net.kigawa.renlin.dsl.state.DslState
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.Component

@Html
interface Dsl {
    var key: String?
    var dslState: DslState?
    fun subDsl(subDsl: Dsl, component0: Component)
    fun mountDslState(state: DslState)
    fun applyElement(element: TagNode)
}