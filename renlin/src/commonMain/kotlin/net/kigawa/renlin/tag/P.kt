package net.kigawa.renlin.tag

import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.category.PalpableContentDsl
import net.kigawa.renlin.tag.item.Item

class PDsl : Dsl, PalpableContentDsl {

}

val p = object : Item<P> {}

object P : Tag<PDsl> {
}
