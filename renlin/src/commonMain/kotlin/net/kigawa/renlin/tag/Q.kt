package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.FlowPalpablePhrasing
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.QCategory
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <q> element
 * 
 * model.Categories: FlowContent, PhrasingContent, PalpableContent
 */
class QDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val q = TagComponent1(Q, ::QDsl)

object Q : Tag<QCategory> {
    override val name: String
        get() = "q"
}