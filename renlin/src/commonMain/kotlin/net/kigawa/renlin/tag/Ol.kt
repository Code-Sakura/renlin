package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.FlowPalpableIntegration
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <ol> element
 * 
 * model.Categories: FlowContent, PalpableContent
 */
class OlDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val ol = TagComponent1(Ol, ::OlDsl)

object Ol : Tag<FlowPalpableIntegration> {
    override val name: String
        get() = "ol"
}