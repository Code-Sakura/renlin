package net.kigawa.renlin.tag.component

import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.RegisteredDslData
import net.kigawa.renlin.tag.Tag
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

interface StructuredComponent<TAG : Tag<*>, DSL : Dsl<*>> : Component1<TAG, DSL> {
    @OptIn(ExperimentalUuidApi::class)
    override fun render(parentDsl: Dsl<*>, block: DSL.() -> Unit, key: String?) {
        val dsl = newDsl()
        dsl.block()
        parentDsl.subDsl(
            RegisteredDslData(
                dsl,
                this,
                { render(parentDsl, block, key) },
                key ?: Uuid.random().toString()
            )
        )
    }
}
