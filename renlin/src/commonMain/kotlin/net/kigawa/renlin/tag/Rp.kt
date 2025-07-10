package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowPhrasingUnion

import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <rp> element
 * 
 * model.Categories: FlowContent, PhrasingContent
 */
class RpDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val rp = TagComponent1(Rp, ::RpDsl)

object Rp : Tag<FlowPhrasingUnion> {
    override val name: String
        get() = "rp"
}