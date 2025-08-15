package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowContent
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.SourceCategory
import net.kigawa.renlin.w3c.category.dsl.FlowContentDsl


/**
 * HTML <source> element
 * 
 * model.Categories: FlowContent
 */
class SourceDsl(dslState: DslState): 
    DslBase<FlowContent>(dslState),
    StatedDsl<FlowContent>,
    FlowContentDsl<FlowContent> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val source = TagComponent1(Source, ::SourceDsl)

object Source : Tag<SourceCategory> {
    override val name: String
        get() = "source"
}