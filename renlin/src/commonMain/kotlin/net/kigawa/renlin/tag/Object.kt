package net.kigawa.renlin.tag

import net.kigawa.renlin.category.EmbeddedFlowFormAssociatedInteractivePalpablePhrasingIntersection
import net.kigawa.renlin.category.EmbeddedFlowFormAssociatedInteractivePalpablePhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState

/**
 * HTML <object> element
 * 
 * Categories: FlowContent, PhrasingContent, EmbeddedContent, PalpableContent, FormAssociatedContent, InteractiveContent
 */
class ObjectDsl(dslState: DslState):
    DslBase<EmbeddedFlowFormAssociatedInteractivePalpablePhrasingIntersection>(dslState), StatedDsl<EmbeddedFlowFormAssociatedInteractivePalpablePhrasingIntersection>, EmbeddedFlowFormAssociatedInteractivePalpablePhrasingDsl<EmbeddedFlowFormAssociatedInteractivePalpablePhrasingIntersection> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val `object` = TagComponent1<Object, ObjectDsl>(Object, ::ObjectDsl)

object Object : Tag<EmbeddedFlowFormAssociatedInteractivePalpablePhrasingIntersection> {
    override val name: String
        get() = "object"
}