package net.kigawa.renlin.tag.component

import net.kigawa.renlin.Html
import net.kigawa.renlin.dsl.TagDsl
import net.kigawa.renlin.dsl.EmptyDsl
import net.kigawa.renlin.tag.Tag

@Html
interface Component1<out TAG : Tag<*>, DSL : TagDsl<*>> : Component {
    fun newDsl(): DSL
    fun render(parentDsl: TagDsl<*>, block: DSL.() -> Unit)

    fun <NEW_DSL : TagDsl<*>> component(
        newDsl: () -> NEW_DSL,
        block: DSL.() -> Unit,
    ): Component1<TAG, NEW_DSL> {
        return object : Component1<TAG, NEW_DSL> {

            override fun newDsl(): NEW_DSL {
                return newDsl()
            }

            override fun render(parentDsl: TagDsl<*>, block: NEW_DSL.() -> Unit) {
                val newDsl = newDsl()
                newDsl.block()
                val baseDsl = this@Component1.newDsl()
                baseDsl.block()
                baseDsl.key = newDsl.key
                parentDsl.subDsl(baseDsl, this@Component1)
            }
        }
    }

    fun component(block: DSL.() -> Unit) = component(::EmptyDsl, block)
}