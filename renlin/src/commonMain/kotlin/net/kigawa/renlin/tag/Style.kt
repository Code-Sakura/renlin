package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.MetadataContent
import net.kigawa.renlin.w3c.category.integration.ContentCategory
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState


/**
 * HTML <style> element
 * 
 * model.Categories: MetadataContent
 */
class StyleDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val style = TagComponent1<Style, StyleDsl>(Style, ::StyleDsl)

object Style : Tag<MetadataContent> {
    override val name: String
        get() = "style"
}