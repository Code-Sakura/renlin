package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowPhrasingIntersection
import net.kigawa.renlin.category.FlowPhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

class AreaDsl(dslState: DslState) :
    DslBase<FlowPhrasingIntersection>(dslState), StatedDsl<FlowPhrasingIntersection>, FlowPhrasingDsl<FlowPhrasingIntersection> {
    override fun applyElement(element: TagNode): () -> Unit {
        return {}
    }
}

val area = TagComponent1<Area, AreaDsl>(Area, ::AreaDsl)

object Area : Tag<FlowPhrasingIntersection> {
    override val name: String
        get() = "area"
}
