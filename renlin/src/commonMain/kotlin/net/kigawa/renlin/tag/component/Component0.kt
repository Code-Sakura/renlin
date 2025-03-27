package net.kigawa.renlin.tag.component

import net.kigawa.renlin.Html
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.EmptyDsl
import net.kigawa.renlin.tag.Tag

@Html
interface Component0<TAG : Tag, DSL : Dsl> {
    fun render(block: DSL.() -> Unit)

    fun <NEW_DSL : Dsl> component(
        newDsl: () -> NEW_DSL,
        block: DSL.(dsl: NEW_DSL) -> Unit,
    ): Component0<TAG, NEW_DSL> {
        val parent = this
        val parentBlock = block
        return object : Component0<TAG, NEW_DSL> {
            override fun render(childBlock: NEW_DSL.() -> Unit) {
                parent.render {
                    val dsl = newDsl()
                    dsl.childBlock()
                    parentBlock(dsl)
                }
            }
        }
    }

    fun component(block: DSL.() -> Unit) = component(::EmptyDsl) { block() }
}