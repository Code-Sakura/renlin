package net.kigawa.renlin.w3c.category

import net.kigawa.renlin.Html
import net.kigawa.renlin.dsl.Dsl


interface  EmbeddedContent : FlowPhrasingIntersection{}
interface EmbeddedContentDsl<CATEGORY_DSL : EmbeddedContent> :
    FlowPhrasingDsl<CATEGORY_DSL>