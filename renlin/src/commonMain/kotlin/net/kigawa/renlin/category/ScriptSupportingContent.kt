package net.kigawa.renlin.category

import net.kigawa.renlin.dsl.Dsl


interface  ScriptSupportingContent : ContentCategory {}
interface ScriptSupportingContentDsl<CATEGORY_DSL : ScriptSupportingContent> :
    Dsl<CATEGORY_DSL>