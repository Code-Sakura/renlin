package net.kigawa.renlin.w3c.category

interface FlowPalpableIntersection : FlowContent, PalpableContent
interface FlowPalpableDsl<CATEGORY_DSL : FlowPalpableIntersection> :
    FlowContentDsl<CATEGORY_DSL>