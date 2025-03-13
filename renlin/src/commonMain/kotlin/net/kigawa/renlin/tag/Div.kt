package net.kigawa.renlin.tag

import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.category.FlowContentDsl
import net.kigawa.renlin.dsl.category.PalpableContentDsl
import net.kigawa.renlin.tag.item.Item

class DivDsl : Dsl, FlowContentDsl, PalpableContentDsl {

}

val div = object : Item<Div> {}

object Div : Tag<DivDsl> {
}
