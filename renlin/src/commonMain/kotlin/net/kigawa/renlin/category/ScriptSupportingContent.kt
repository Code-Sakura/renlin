package net.kigawa.renlin.category

import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.StatedDsl


interface  ScriptSupportingContent : ContentCategory {}
interface ScriptSupportingContentDsl<CATEGORY_DSL : ScriptSupportingContent> :
    StatedDsl<CATEGORY_DSL>