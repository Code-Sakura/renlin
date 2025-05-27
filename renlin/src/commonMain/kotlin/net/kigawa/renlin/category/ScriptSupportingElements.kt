package net.kigawa.renlin.category

import net.kigawa.renlin.Html
import net.kigawa.renlin.dsl.Dsl


interface  ScriptSupportingElements : ContentCategory {}
interface ScriptSupportingElementsDsl<CATEGORY_DSL : ScriptSupportingElements> :
    Dsl<CATEGORY_DSL>