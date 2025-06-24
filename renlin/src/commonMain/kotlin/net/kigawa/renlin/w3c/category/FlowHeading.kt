package net.kigawa.renlin.w3c.category

interface FlowHeadingIntersection : FlowContent, HeadingContent
interface FlowHeadingDsl<CATEGORY_DSL : FlowHeadingIntersection> :
    FlowContentDsl<CATEGORY_DSL>