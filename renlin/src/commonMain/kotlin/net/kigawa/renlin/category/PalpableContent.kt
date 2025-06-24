package net.kigawa.renlin.category

import net.kigawa.renlin.Html
import net.kigawa.renlin.dsl.Dsl


interface  PalpableContent : ContentCategory {}
interface PalpableContentDsl<CATEGORY_DSL : PalpableContent> :
    Dsl<CATEGORY_DSL>