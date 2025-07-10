package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowPalpablePhrasingUnion

import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <time> element
 * 
 * model.Categories: FlowContent, PhrasingContent, PalpableContent
 */
class TimeDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val time = TagComponent1(Time, ::TimeDsl)

object Time : Tag<FlowPalpablePhrasingUnion> {
    override val name: String
        get() = "time"
}