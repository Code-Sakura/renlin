package net.kigawa.renlin.tag.component

import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.tag.Tag

class TagComponent1<TAG : Tag<*>, DSL : Dsl<*>>(
    override val tag: TAG,
    private val newDslFunc: () -> DSL,
) : Component1<TAG, DSL>, TagComponent<TAG> {
    override fun newDsl(): DSL {
        return newDslFunc()
    }

    override fun render(parentDsl: Dsl<*>, block: DSL.() -> Unit) {
        val dsl = newDsl()
        dsl.block()
        parentDsl.subDsl(dsl, this)
    }
}