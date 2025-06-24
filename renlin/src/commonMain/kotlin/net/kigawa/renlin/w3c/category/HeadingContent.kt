package net.kigawa.renlin.w3c.category

import net.kigawa.renlin.Html


interface  HeadingContent : FlowContent {}

@Html
interface HeadingContentDsl<CATEGORY_DSL : HeadingContent> :
    FlowContentDsl<CATEGORY_DSL>