package net.kigawa.renlin.tag.component

import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.tag.Tag

class TagComponent0<TAG : Tag<DSL>, DSL : Dsl>(
    private val tag: TAG,
) : Component0<TAG, DSL> {
    override fun render(parentDsl: Dsl, block: DSL.() -> Unit) {
        val element = parentDsl.element.appendChild(tag)
        val dsl = tag.newDsl(element)
        dsl.block()
    }
}