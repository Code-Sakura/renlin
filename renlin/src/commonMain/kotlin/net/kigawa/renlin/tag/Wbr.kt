package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowPhrasingUnion

import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <wbr> element
 * 
 * model.Categories: FlowContent, PhrasingContent
 */
class WbrDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val wbr = TagComponent1<Wbr, WbrDsl>(Wbr, ::WbrDsl)

object Wbr : Tag<FlowPhrasingUnion> {
    override val name: String
        get() = "wbr"
}