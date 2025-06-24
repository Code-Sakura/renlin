package net.kigawa.renlin.category

interface FlowPhrasingIntersection : FlowContent, PhrasingContent
interface FlowPhrasingDsl<CATEGORY_DSL : FlowPhrasingIntersection> :
    FlowContentDsl<CATEGORY_DSL>