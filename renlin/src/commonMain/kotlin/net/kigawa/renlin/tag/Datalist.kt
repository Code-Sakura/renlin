package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowPhrasingUnion
import net.kigawa.renlin.w3c.category.integration.ContentCategory
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState


/**
 * HTML <datalist> element
 * 
 * model.Categories: FlowContent, PhrasingContent
 */
class DatalistDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val datalist = TagComponent1<Datalist, DatalistDsl>(Datalist, ::DatalistDsl)

object Datalist : Tag<FlowPhrasingUnion> {
    override val name: String
        get() = "datalist"
}