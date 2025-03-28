package net.kigawa.renlin.tag

import net.kigawa.renlin.Html
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.category.PalpableContentDsl
import net.kigawa.renlin.element.TagElement
import net.kigawa.renlin.tag.component.TagComponent0
import net.kigawa.renlin.tag.item.FlowContentItem

class PDsl(element: TagElement) : DslBase(element), Dsl, PalpableContentDsl {

}

@Html
val p = TagComponent0<P, PDsl>(P)

object P : Tag<PDsl>, FlowContentItem<PDsl> {
    override val name: String
        get() = "p"

    override fun newDsl(element: TagElement): PDsl {
        return PDsl(element)
    }
}
