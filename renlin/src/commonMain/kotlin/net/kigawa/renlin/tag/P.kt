package net.kigawa.renlin.tag

import net.kigawa.renlin.Html
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.category.PalpableContentDsl
import net.kigawa.renlin.tag.component.Component0
import net.kigawa.renlin.tag.item.FlowContentItem

class PDsl : Dsl, PalpableContentDsl {

}

@Html
val p = object : Component0<P, PDsl> {
    override fun render(block: PDsl.() -> Unit) {
        TODO("Not yet implemented")
    }
}

object P : Tag, FlowContentItem {
}
