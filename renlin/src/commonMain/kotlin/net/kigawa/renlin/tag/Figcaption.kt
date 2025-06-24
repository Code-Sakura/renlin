package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowContent
import net.kigawa.renlin.category.FlowContentDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState

/**
 * HTML <figcaption> element
 * 
 * Categories: FlowContent
 */
class FigcaptionDsl(dslState: DslState):
    DslBase<FlowContent>(dslState), StatedDsl<FlowContent>, FlowContentDsl<FlowContent> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val figcaption = TagComponent1<Figcaption, FigcaptionDsl>(Figcaption, ::FigcaptionDsl)

object Figcaption : Tag<FlowContent> {
    override val name: String
        get() = "figcaption"
}