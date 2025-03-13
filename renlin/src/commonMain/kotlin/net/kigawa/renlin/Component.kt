package net.kigawa.renlin

import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.tag.item.Item


interface Component0<TAG : Tag<in Nothing>> : Item<TAG> {

}

fun <TAG : Tag<DSL>, DSL : Dsl> Item<TAG>.component(
    block: DSL.() -> Unit,
): Component0<TAG> {
    return object : Component0<TAG> {}
}