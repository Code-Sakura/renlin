package net.kigawa.renlin.w3c.category

interface FlowPalpablePhrasingIntersection : FlowContent, PalpableContent, PhrasingContent
interface FlowPalpablePhrasingDsl<CATEGORY_DSL : FlowPalpablePhrasingIntersection> :
    FlowContentDsl<CATEGORY_DSL>