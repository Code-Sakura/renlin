package net.kigawa.renlin.w3c.category

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

interface DslContentCategory<CATEGORY_DSL: DslContentCategory<CATEGORY_DSL>>