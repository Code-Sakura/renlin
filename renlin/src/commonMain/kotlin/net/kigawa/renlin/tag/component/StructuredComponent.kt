package net.kigawa.renlin.tag.component

import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.RegisteredDslData
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.util.debug

interface StructuredComponent<TAG : Tag<*>, DSL : Dsl<*>> : Component1<TAG, DSL> {
    override fun render(parentDsl: Dsl<*>, block: DSL.() -> Unit) {
        val dsl = newDsl()
        dsl.block()
        debug("render", dsl.key)
        parentDsl.subDsl(RegisteredDslData(dsl, this) {
            render(parentDsl, block)
        })
    }
}