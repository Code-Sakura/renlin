package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowPalpablePhrasingUnion

import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <code> element
 * 
 * model.Categories: FlowContent, PhrasingContent, PalpableContent
 */
class CodeDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val code = TagComponent1<Code, CodeDsl>(Code, ::CodeDsl)

object Code : Tag<FlowPalpablePhrasingUnion> {
    override val name: String
        get() = "code"
}