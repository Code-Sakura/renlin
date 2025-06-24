package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowContent
import net.kigawa.renlin.category.FlowContentDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

class OptgroupDsl :
    DslBase<FlowContent>(), StatedDsl<FlowContent>, FlowContentDsl<FlowContent> {
    override fun applyElement(element: TagNode) {
    }
}

val optgroup = TagComponent1<Optgroup, OptgroupDsl>(Optgroup, ::OptgroupDsl)

object Optgroup : Tag<FlowContent> {
    override val name: String
        get() = "optgroup"
}