package net.kigawa.renlin.tag.component

import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.tag.Tag

class TagComponent1<TAG : Tag<*>, DSL : Dsl<*>>(
    override val tag: TAG,
    private val newDslFunc: () -> DSL,
) : SubComponent<TAG, DSL>, TagComponent<TAG>, StructuredComponent<TAG, DSL> {
    override fun newDsl(): DSL {
        return newDslFunc()
    }

}