package net.kigawa.renlin.category

import net.kigawa.renlin.Html
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.StatedDsl


interface  PalpableContent : ContentCategory {}
interface PalpableContentDsl<CATEGORY_DSL : PalpableContent> :
    StatedDsl<CATEGORY_DSL>