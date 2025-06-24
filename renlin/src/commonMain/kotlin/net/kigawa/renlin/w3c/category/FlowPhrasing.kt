package net.kigawa.renlin.w3c.category

interface FlowPhrasingIntersection : FlowContent, PhrasingContent
interface FlowPhrasingDsl<CATEGORY_DSL : FlowPhrasingIntersection> :
    FlowContentDsl<CATEGORY_DSL>