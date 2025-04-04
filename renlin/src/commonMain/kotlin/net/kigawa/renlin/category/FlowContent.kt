package net.kigawa.renlin.category

import net.kigawa.renlin.Html
import net.kigawa.renlin.dsl.TagDsl


interface FlowContent : ContentCategory {
//    override fun newContentDsl(): FlowContentDsl {
//        return FragmentDsl()
//    }
}

@Html
interface FlowContentDsl<CATEGORY_DSL : FlowContent> :
    TagDsl<CATEGORY_DSL> {

//    fun fragment(block: FlowContentDsl.() -> Unit) {
//        object : FragmentComponent<FlowContentDsl>() {
//            override fun newDsl(): FlowContentDsl {
//                return FragmentDsl()
//            }
//        }.render(this, block)
//    }
}

