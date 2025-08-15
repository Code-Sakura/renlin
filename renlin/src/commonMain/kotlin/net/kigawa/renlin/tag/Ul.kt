package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.FlowPalpable
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.UlCategory
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <ul> element
 * 
 * model.Categories: FlowContent, PalpableContent
 */
class UlDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val ul = TagComponent1(Ul, ::UlDsl)

object Ul : Tag<UlCategory> {
    override val name: String
        get() = "ul"
}