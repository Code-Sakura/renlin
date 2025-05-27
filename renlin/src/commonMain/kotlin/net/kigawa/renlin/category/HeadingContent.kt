package net.kigawa.renlin.category

import net.kigawa.renlin.Html


interface  HeadingContent : FlowContent {}

@Html
interface HeadingContentDsl<CATEGORY_DSL : HeadingContent> :
    FlowContentDsl<CATEGORY_DSL>