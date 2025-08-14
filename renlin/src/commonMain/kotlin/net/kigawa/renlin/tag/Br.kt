package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.FlowPhrasingIntegration
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <br> element
 * 
 * model.Categories: FlowContent, PhrasingContent
 */
class BrDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val br = TagComponent1(Br, ::BrDsl)

object Br : Tag<FlowPhrasingIntegration> {
    override val name: String
        get() = "br"
}