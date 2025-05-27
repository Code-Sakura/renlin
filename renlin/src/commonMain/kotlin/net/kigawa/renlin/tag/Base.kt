package net.kigawa.renlin.tag

import net.kigawa.renlin.category.MetadataContent
import net.kigawa.renlin.category.MetadataContentDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <base> element
 * 
 * Categories: MetadataContent
 */
class BaseDsl :
    DslBase<MetadataContent>(), Dsl<MetadataContent>, MetadataContentDsl<MetadataContent> {
    override fun applyElement(element: TagNode) {
    }
}

val base = TagComponent1<Base, BaseDsl>(Base, ::BaseDsl)

object Base : Tag<MetadataContent> {
    override val name: String
        get() = "base"
}