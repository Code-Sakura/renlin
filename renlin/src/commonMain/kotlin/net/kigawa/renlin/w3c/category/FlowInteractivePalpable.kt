package net.kigawa.renlin.w3c.category

interface FlowInteractivePalpableIntersection : FlowContent, InteractiveContent, PalpableContent
interface FlowInteractivePalpableDsl<CATEGORY_DSL : FlowInteractivePalpableIntersection> :
    FlowContentDsl<CATEGORY_DSL>