package net.kigawa.renlin.tag

import net.kigawa.renlin.category.MetadataContent
import net.kigawa.renlin.category.MetadataContentDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState

/**
 * HTML <base> element
 * 
 * Categories: MetadataContent
 */
class BaseDsl(dslState: DslState):
    DslBase<MetadataContent>(dslState), StatedDsl<MetadataContent>, MetadataContentDsl<MetadataContent> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val base = TagComponent1<Base, BaseDsl>(Base, ::BaseDsl)

object Base : Tag<MetadataContent> {
    override val name: String
        get() = "base"
}