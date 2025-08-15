package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.FlowPalpablePhrasing
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.DelCategory
import net.kigawa.renlin.w3c.category.dsl.FlowPalpablePhrasingDsl


/**
 * HTML <del> element
 * 
 * model.Categories: FlowContent, PhrasingContent, PalpableContent
 */
class DelDsl(dslState: DslState): 
    DslBase<FlowPalpablePhrasing>(dslState),
    StatedDsl<FlowPalpablePhrasing>,
    FlowPalpablePhrasingDsl<FlowPalpablePhrasing> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val del = TagComponent1(Del, ::DelDsl)

object Del : Tag<DelCategory> {
    override val name: String
        get() = "del"
}