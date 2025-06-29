package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowPalpablePhrasingUnion
import net.kigawa.renlin.w3c.category.integration.ContentCategory
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState


/**
 * HTML <bdi> element
 * 
 * model.Categories: FlowContent, PhrasingContent, PalpableContent
 */
class BdiDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val bdi = TagComponent1<Bdi, BdiDsl>(Bdi, ::BdiDsl)

object Bdi : Tag<FlowPalpablePhrasingUnion> {
    override val name: String
        get() = "bdi"
}