package net.kigawa.renlin.category

import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.EmptyDsl
import net.kigawa.renlin.tag.Fragment
import net.kigawa.renlin.tag.FragmentComponent
import net.kigawa.renlin.tag.component.Component0

interface ContentCategory<DSL : DslContentCategory> {
    fun newContentDsl(): DSL
    fun component(
        block: DSL.() -> Unit,
    ): Component0<Fragment<DSL>, EmptyDsl> {
        return object : FragmentComponent<DSL>() {
            override fun newDsl(): DSL {
                return newContentDsl()
            }
        }.component(block)
    }
}

sealed interface DslContentCategory : Dsl {

}