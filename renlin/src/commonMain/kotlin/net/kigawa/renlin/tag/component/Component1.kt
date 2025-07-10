package net.kigawa.renlin.tag.component

import net.kigawa.hakate.api.state.State
import net.kigawa.renlin.Html
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.EmptyDsl
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.dsl.RegisteredDslData
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.w3c.category.ContentCategory
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

@Html
interface Component1<out TAG : Tag<*>, DSL : Dsl> : Component {
    fun newDsl(dslState: DslState): DSL
    fun render(parentDsl: StatedDsl<*>, block: DSL.() -> Unit, key: String?)

    @OptIn(ExperimentalUuidApi::class)
    fun <NEW_DSL : Dsl> component(
        newDsl: () -> NEW_DSL,
        block: DSL.() -> Unit,
    ): Component1<TAG, NEW_DSL> {
        return object : Component1<TAG, NEW_DSL> {

            override fun newDsl(dslState: DslState): NEW_DSL {
                return newDsl()
            }

            override fun render(parentDsl: StatedDsl<*>, block: NEW_DSL.() -> Unit, key: String?) {
                val nonNullKey = key ?: Uuid.random().toString()
                val state = parentDsl.dslState.getOrCreateSubDslState(nonNullKey, this@Component1)
                val newDsl = newDsl()
                newDsl.block()
                val baseDsl = this@Component1.newDsl(state)
                baseDsl.block()
                parentDsl.registerSubDsl(
                    RegisteredDslData(
                        object : StatedDsl<ContentCategory> by baseDsl {
                            override val states: Set<State<*>>
                                get() = baseDsl.states + newDsl.states
                        },
                        this@Component1,
                        { render(parentDsl, block = block, key) },
                        nonNullKey
                    )
                )
            }
        }
    }

    fun component(block: DSL.() -> Unit) = component(::EmptyDsl, block)
}