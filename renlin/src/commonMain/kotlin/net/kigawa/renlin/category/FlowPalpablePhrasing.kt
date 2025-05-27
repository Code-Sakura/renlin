package net.kigawa.renlin.category

interface FlowPalpablePhrasingIntersection : FlowContent, PalpableContent, PhrasingContent
interface FlowPalpablePhrasingDsl<CATEGORY_DSL : FlowPalpablePhrasingIntersection> :
    FlowContentDsl<CATEGORY_DSL>