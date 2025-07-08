package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowFormAssociatedInteractivePalpablePhrasingUnion

import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <textarea> element
 * 
 * model.Categories: FlowContent, PhrasingContent, InteractiveContent, PalpableContent, FormAssociatedContent
 */
class TextareaDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val textarea = TagComponent1<Textarea, TextareaDsl>(Textarea, ::TextareaDsl)

object Textarea : Tag<FlowFormAssociatedInteractivePalpablePhrasingUnion> {
    override val name: String
        get() = "textarea"
}