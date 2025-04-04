package net.kigawa.renlin.tag.component

import net.kigawa.renlin.dsl.TagDsl
import net.kigawa.renlin.tag.Tag

interface StructuredComponent<TAG : Tag<*>, DSL : TagDsl<*>> : Component1<TAG, DSL> {
    override fun render(parentDsl: TagDsl<*>, block: DSL.() -> Unit) {
        val dsl = newDsl()
        dsl.block()
        parentDsl.subDsl(dsl, this)
    }
}