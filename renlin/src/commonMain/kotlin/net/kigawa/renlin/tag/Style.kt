package net.kigawa.renlin.tag

import net.kigawa.renlin.category.MetadataContent
import net.kigawa.renlin.category.MetadataContentDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <style> element
 * 
 * Categories: MetadataContent
 */
class StyleDsl :
    DslBase<MetadataContent>(), Dsl<MetadataContent>, MetadataContentDsl<MetadataContent> {
    override fun applyElement(element: TagNode) {
    }
}

val style = TagComponent1<Style, StyleDsl>(Style, ::StyleDsl)

object Style : Tag<MetadataContent> {
    override val name: String
        get() = "style"
}