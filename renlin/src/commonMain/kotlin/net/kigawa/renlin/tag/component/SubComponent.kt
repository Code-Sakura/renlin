package net.kigawa.renlin.tag.component

import net.kigawa.hakate.api.state.State
import net.kigawa.renlin.Html
import net.kigawa.renlin.category.ContentCategory
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.EmptyDsl
import net.kigawa.renlin.dsl.RegisteredDslData
import net.kigawa.renlin.tag.Tag

@Html
interface SubComponent<out TAG : Tag<*>, DSL : Dsl<*>> : Component {
    fun newDsl(): DSL
    fun render(parentDsl: Dsl<*>, block: DSL.() -> Unit)

    fun <NEW_DSL : Dsl<*>> component(
        newDsl: () -> NEW_DSL,
        block: DSL.(dsl: NEW_DSL) -> Unit,
    ): SubComponent<TAG, NEW_DSL> {
        return object : SubComponent<TAG, NEW_DSL> {

            override fun newDsl(): NEW_DSL {
                return newDsl()
            }

            override fun render(parentDsl: Dsl<*>, block: NEW_DSL.() -> Unit) {
                val newDsl = newDsl()
                newDsl.block()
                val baseDsl = this@SubComponent.newDsl()
                baseDsl.block(newDsl)
                baseDsl.key = newDsl.key
                parentDsl.subDsl(RegisteredDslData(object : Dsl<ContentCategory> by baseDsl {
                    override val states: Set<State<*>>
                        get() = baseDsl.states + newDsl.states
                }, this@SubComponent) {
                    render(parentDsl, block = block)
                })
            }
        }
    }

    fun component(block: DSL.() -> Unit) = component(::EmptyDsl) { block }
}