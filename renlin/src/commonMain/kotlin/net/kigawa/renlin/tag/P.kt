package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.FlowPalpable
    import net.kigawa.renlin.w3c.category.native.PhrasingContent
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.PCategory
import net.kigawa.renlin.w3c.category.dsl.PhrasingContentDsl


/**
 * HTML <p> element
 * 
 * model.Categories: FlowContent, PalpableContent
 */
class PDsl(dslState: DslState): 
    DslBase<PhrasingContent>(dslState),
    StatedDsl<PhrasingContent>,
    PhrasingContentDsl<PhrasingContent> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val p = TagComponent1(P, ::PDsl)

object P : Tag<PCategory> {
    override val name: String
        get() = "p"
}