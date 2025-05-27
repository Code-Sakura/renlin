package net.kigawa.renlin.category

interface FlowPalpableIntersection : FlowContent, PalpableContent
interface FlowPalpableDsl<CATEGORY_DSL : FlowPalpableIntersection> :
    FlowContentDsl<CATEGORY_DSL>