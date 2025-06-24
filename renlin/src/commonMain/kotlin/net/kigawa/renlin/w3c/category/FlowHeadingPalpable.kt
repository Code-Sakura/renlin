package net.kigawa.renlin.w3c.category

interface FlowHeadingPalpableIntersection : FlowContent, HeadingContent, PalpableContent
interface FlowHeadingPalpableDsl<CATEGORY_DSL : FlowHeadingPalpableIntersection> :
    FlowContentDsl<CATEGORY_DSL>