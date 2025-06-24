package net.kigawa.renlin.w3c.category

import net.kigawa.renlin.Html
import net.kigawa.renlin.dsl.Dsl


interface  InteractiveContent : FlowPhrasingIntersection {}

@Html
interface InteractiveContentDsl<CATEGORY_DSL : InteractiveContent> :
    FlowPhrasingDsl<CATEGORY_DSL>