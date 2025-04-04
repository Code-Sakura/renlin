package net.kigawa.renlin.tag

import net.kigawa.renlin.Html
import net.kigawa.renlin.category.FlowContent
import net.kigawa.renlin.category.PhrasingContent
import net.kigawa.renlin.category.PhrasingContentDsl
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

class PDsl() : DslBase<PhrasingContent>(), Dsl<PhrasingContent>, PhrasingContentDsl<PhrasingContent> {
    override fun applyElement(element: TagNode) {
    }

    override var textContent: String? = null
        set(value) {
            text.render(this) {
                text = value
            }
            field = value
        }
}

@Html
val p = TagComponent1<P, PDsl>(P, ::PDsl)

object P : Tag<FlowContent> {
    override val name: String
        get() = "p"
}
