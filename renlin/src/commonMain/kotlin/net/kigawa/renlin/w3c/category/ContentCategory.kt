package net.kigawa.renlin.w3c.category

import net.kigawa.renlin.w3c.category.native.FlowContent
import net.kigawa.renlin.w3c.category.native.PhrasingContent

interface ContentCategory {
//    fun newContentDsl(): DSL
//    fun component(
//        block: DSL.() -> Unit,
//    ): Component1<Fragment<DSL>, EmptyDsl> {
//        return object : FragmentComponent<DSL>() {
//            override fun newDsl(): DSL {
//                return newContentDsl()
//            }
//        }.component(block)
//    }
}

interface AllContentCategory : ContentCategory, FlowContent, PhrasingContent
interface DslContentCategory<CATEGORY_DSL : DslContentCategory<CATEGORY_DSL>>