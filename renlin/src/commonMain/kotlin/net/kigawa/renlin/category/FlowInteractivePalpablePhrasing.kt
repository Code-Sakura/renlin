package net.kigawa.renlin.category

interface FlowInteractivePalpablePhrasingIntersection : FlowContent, InteractiveContent, PalpableContent, PhrasingContent
interface FlowInteractivePalpablePhrasingDsl<CATEGORY_DSL : FlowInteractivePalpablePhrasingIntersection> :
    FlowContentDsl<CATEGORY_DSL>