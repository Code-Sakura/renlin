package net.kigawa.renlin.tag.component

import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.tag.Tag

class TagComponent0<TAG : Tag<DSL>, DSL : Dsl>(
    override val tag: TAG,
) : Component0<TAG, DSL>, TagComponent<TAG> {
    override fun newDsl(): DSL {
        return tag.newDsl()
    }

    override fun render(parentDsl: Dsl, block: DSL.() -> Unit) {
        val dsl = newDsl()
        dsl.block()
        parentDsl.subDsl(dsl, this)
    }
}