package net.kigawa.renlin.w3c.category

import net.kigawa.renlin.Html


interface  SectioningContent : FlowContent {}

@Html
interface SectioningContentDsl<CATEGORY_DSL : SectioningContent> :
    FlowContentDsl<CATEGORY_DSL>