package net.kigawa.renlin.tag

import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.category.FlowContentDsl
import net.kigawa.renlin.dsl.category.PalpableContentDsl
import net.kigawa.renlin.tag.component.Component0
import net.kigawa.renlin.tag.item.FlowContentItem

class DivDsl : Dsl, FlowContentDsl, PalpableContentDsl {

}

val div = object : Component0<Div, DivDsl> {
    override fun render(block: DivDsl.() -> Unit) {
        TODO("Not yet implemented")
    }
}

object Div : FlowContentItem,Tag {
}
