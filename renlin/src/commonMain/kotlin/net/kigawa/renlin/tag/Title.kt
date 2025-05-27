package net.kigawa.renlin.tag

import net.kigawa.renlin.category.MetadataContent
import net.kigawa.renlin.category.MetadataContentDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <title> element
 * 
 * Categories: MetadataContent
 */
class TitleDsl :
    DslBase<MetadataContent>(), Dsl<MetadataContent>, MetadataContentDsl<MetadataContent> {
    override fun applyElement(element: TagNode) {
    }
}

val title = TagComponent1<Title, TitleDsl>(Title, ::TitleDsl)

object Title : Tag<MetadataContent> {
    override val name: String
        get() = "title"
}