package net.kigawa.renlin.category

interface FlowHeadingIntersection : FlowContent, HeadingContent
interface FlowHeadingDsl<CATEGORY_DSL : FlowHeadingIntersection> :
    FlowContentDsl<CATEGORY_DSL>