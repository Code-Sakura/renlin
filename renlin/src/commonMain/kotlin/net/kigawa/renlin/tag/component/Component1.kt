package net.kigawa.renlin.tag.component

import net.kigawa.hakate.api.state.State
import net.kigawa.renlin.Html
import net.kigawa.renlin.category.ContentCategory
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.EmptyDsl
import net.kigawa.renlin.dsl.RegisteredDslData
import net.kigawa.renlin.tag.Tag
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

@Html
interface Component1<out TAG : Tag<*>, DSL : Dsl<*>> : Component {
    fun newDsl(): DSL
    fun render(parentDsl: Dsl<*>, block: DSL.() -> Unit, key: String?)

    @OptIn(ExperimentalUuidApi::class)
    fun <NEW_DSL : Dsl<*>> component(
        newDsl: () -> NEW_DSL,
        block: DSL.() -> Unit,
    ): Component1<TAG, NEW_DSL> {
        return object : Component1<TAG, NEW_DSL> {

            override fun newDsl(): NEW_DSL {
                return newDsl()
            }

            override fun render(parentDsl: Dsl<*>, block: NEW_DSL.() -> Unit, key: String?) {
                val newDsl = newDsl()
                newDsl.block()
                val baseDsl = this@Component1.newDsl()
                baseDsl.block()
                parentDsl.subDsl(
                    RegisteredDslData(
                        object : Dsl<ContentCategory> by baseDsl {
                            override val states: Set<State<*>>
                                get() = baseDsl.states + newDsl.states
                        },
                        this@Component1,
                        { render(parentDsl, block = block, key) },
                        key ?: Uuid.random().toString()
                    )
                )
            }
        }
    }

    fun component(block: DSL.() -> Unit) = component(::EmptyDsl, block)
}