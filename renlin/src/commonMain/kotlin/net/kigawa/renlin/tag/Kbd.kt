package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowPalpablePhrasingUnion

import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <kbd> element
 * 
 * model.Categories: FlowContent, PhrasingContent, PalpableContent
 */
class KbdDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val kbd = TagComponent1(Kbd, ::KbdDsl)

object Kbd : Tag<FlowPalpablePhrasingUnion> {
    override val name: String
        get() = "kbd"
}