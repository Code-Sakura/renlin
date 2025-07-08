package net.kigawa.renlin.component

import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.dsl.RegisteredDslData
import net.kigawa.renlin.tag.Tag
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

interface StructuredComponent<TAG : Tag<*>, DSL : StatedDsl<*>> : Component1<TAG, DSL> {
    @OptIn(ExperimentalUuidApi::class)
    override fun render(parentDsl: StatedDsl<*>, block: DSL.() -> Unit, key: String?) {
        val nonNullKey = key ?: Uuid.random().toString()
        val dslState = parentDsl.dslState.getOrCreateSubDslState(nonNullKey, this)
        val dsl = newDsl(dslState)
        dsl.block()
        parentDsl.registerSubDsl(
            RegisteredDslData(
                dsl,
                this,
                { render(parentDsl, block, key) },
                nonNullKey
            )
        )
    }
}
