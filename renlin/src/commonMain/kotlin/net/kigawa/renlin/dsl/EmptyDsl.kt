package net.kigawa.renlin.dsl

import net.kigawa.renlin.dsl.state.DslState
import net.kigawa.renlin.element.TagElement
import net.kigawa.renlin.tag.component.Component

class EmptyDsl : Dsl {
    override var key: String? = null
    override fun subDsl(subDsl: Dsl, component0: Component) {
        TODO("Not yet implemented")
    }

    override fun mountDslState(state: DslState) {
        TODO("Not yet implemented")
    }

    override fun applyElement(element: TagElement) {
        TODO("Not yet implemented")
    }
}