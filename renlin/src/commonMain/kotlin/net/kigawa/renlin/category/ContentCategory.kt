package net.kigawa.renlin.category

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

interface AllContentCategory : ContentCategory, FlowContent, PhrasingContent, FlowPhrasingIntersection
interface DslContentCategory<CATEGORY_DSL : DslContentCategory<CATEGORY_DSL>>