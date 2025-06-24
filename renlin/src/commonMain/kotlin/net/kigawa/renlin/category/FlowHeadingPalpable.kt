package net.kigawa.renlin.category

interface FlowHeadingPalpableIntersection : FlowContent, HeadingContent, PalpableContent
interface FlowHeadingPalpableDsl<CATEGORY_DSL : FlowHeadingPalpableIntersection> :
    FlowContentDsl<CATEGORY_DSL>