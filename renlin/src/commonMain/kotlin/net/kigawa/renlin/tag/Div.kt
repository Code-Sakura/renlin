package net.kigawa.renlin.tag

import net.kigawa.renlin.Component0
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.category.FlowContentDsl
import net.kigawa.renlin.dsl.category.PalpableContentDsl
import net.kigawa.renlin.tag.item.Item

class DivDsl : Dsl, FlowContentDsl, PalpableContentDsl {

}

val div = object : Item<P> {}

object Div : Tag<PDsl> {
}

fun <TAG : Tag<DSL>, DSL : Dsl> Item<TAG>.component(
    block: DSL.() -> Unit,
): Component0<TAG> {
    return object : Component0<TAG> {}
}