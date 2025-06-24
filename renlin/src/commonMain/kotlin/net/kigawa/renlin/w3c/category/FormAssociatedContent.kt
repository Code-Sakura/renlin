package net.kigawa.renlin.w3c.category

import net.kigawa.renlin.Html
import net.kigawa.renlin.dsl.Dsl


interface  FormAssociatedContent : FlowContent {}
interface FormAssociatedContentDsl<CATEGORY_DSL : FormAssociatedContent> :
    FlowContentDsl<CATEGORY_DSL>