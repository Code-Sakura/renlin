package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.FlowInteractivePalpablePhrasing
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.ACategory
import net.kigawa.renlin.w3c.category.dsl.FlowInteractivePalpablePhrasingDsl


/**
 * HTML <a> element
 * 
 * model.Categories: FlowContent, PhrasingContent, PalpableContent, InteractiveContent
 */
class ADsl(dslState: DslState): 
    DslBase<FlowInteractivePalpablePhrasing>(dslState),
    StatedDsl<FlowInteractivePalpablePhrasing>,
    FlowInteractivePalpablePhrasingDsl<FlowInteractivePalpablePhrasing> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val a = TagComponent1(A, ::ADsl)

object A : Tag<ACategory> {
    override val name: String
        get() = "a"
}