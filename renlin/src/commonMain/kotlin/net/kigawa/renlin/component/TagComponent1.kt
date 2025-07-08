package net.kigawa.renlin.component

import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.tag.Tag

class TagComponent1<TAG : Tag<*>, DSL : StatedDsl<*>>(
    override val tag: TAG,
    private val newDslFunc: (DslState) -> DSL,
) : Component1<TAG, DSL>, TagComponent<TAG>, StructuredComponent<TAG, DSL> {
    override fun newDsl(dslState: DslState): DSL {
        return newDslFunc(dslState)
    }

}