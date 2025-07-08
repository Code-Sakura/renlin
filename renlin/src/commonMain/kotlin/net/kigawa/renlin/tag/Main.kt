package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowPalpableUnion

import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <main> element
 * 
 * model.Categories: FlowContent, PalpableContent
 */
class MainDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val main = TagComponent1<Main, MainDsl>(Main, ::MainDsl)

object Main : Tag<FlowPalpableUnion> {
    override val name: String
        get() = "main"
}