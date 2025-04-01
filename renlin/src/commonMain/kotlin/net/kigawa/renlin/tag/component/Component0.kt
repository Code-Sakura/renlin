package net.kigawa.renlin.tag.component

import net.kigawa.renlin.Html
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.EmptyDsl
import net.kigawa.renlin.tag.Tag

@Html
interface Component0<TAG : Tag<*>, DSL : Dsl> : Component {
    val tag: TAG
    fun newDsl(): DSL
    fun render(parentDsl: Dsl, block: DSL.() -> Unit) {
        val dsl = newDsl()
        dsl.block()
        parentDsl.subDsl(dsl, this)
    }

    fun <NEW_DSL : Dsl> component(
        newDsl: () -> NEW_DSL,
        block: DSL.(dsl: NEW_DSL) -> Unit,
    ): Component0<TAG, NEW_DSL> {
        return object : Component0<TAG, NEW_DSL> {
            override val tag: TAG
                get() = tag

            override fun newDsl(): NEW_DSL {
                return newDsl()
            }
        }
    }

    fun component(block: DSL.() -> Unit) = component(::EmptyDsl) { block() }
}