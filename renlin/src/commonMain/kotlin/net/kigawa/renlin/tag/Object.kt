package net.kigawa.renlin.tag

import net.kigawa.renlin.category.EmbeddedFlowFormAssociatedInteractivePalpablePhrasingIntersection
import net.kigawa.renlin.category.EmbeddedFlowFormAssociatedInteractivePalpablePhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <object> element
 * 
 * Categories: FlowContent, PhrasingContent, EmbeddedContent, PalpableContent, FormAssociatedContent, InteractiveContent
 */
class ObjectDsl :
    DslBase<EmbeddedFlowFormAssociatedInteractivePalpablePhrasingIntersection>(), Dsl<EmbeddedFlowFormAssociatedInteractivePalpablePhrasingIntersection>, EmbeddedFlowFormAssociatedInteractivePalpablePhrasingDsl<EmbeddedFlowFormAssociatedInteractivePalpablePhrasingIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val `object` = TagComponent1<Object, ObjectDsl>(Object, ::ObjectDsl)

object Object : Tag<EmbeddedFlowFormAssociatedInteractivePalpablePhrasingIntersection> {
    override val name: String
        get() = "object"
}