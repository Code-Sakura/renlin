package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.MetadataContent

import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.dsl.MetadataContentDsl


/**
 * HTML <title> element
 * 
 * model.Categories: MetadataContent
 */
class TitleDsl(dslState: DslState): 
    DslBase<MetadataContent>(dslState),
    StatedDsl<MetadataContent>,
    MetadataContentDsl<MetadataContent> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val title = TagComponent1<Title, TitleDsl>(Title, ::TitleDsl)

object Title : Tag<MetadataContent> {
    override val name: String
        get() = "title"
}