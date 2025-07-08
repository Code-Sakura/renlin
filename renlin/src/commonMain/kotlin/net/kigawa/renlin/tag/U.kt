package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowPalpablePhrasingUnion

import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <u> element
 * 
 * model.Categories: FlowContent, PhrasingContent, PalpableContent
 */
class UDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val u = TagComponent1<U, UDsl>(U, ::UDsl)

object U : Tag<FlowPalpablePhrasingUnion> {
    override val name: String
        get() = "u"
}