package net.kigawa.renlin.category

interface FlowInteractivePalpableIntersection : FlowContent, InteractiveContent, PalpableContent
interface FlowInteractivePalpableDsl<CATEGORY_DSL : FlowInteractivePalpableIntersection> :
    FlowContentDsl<CATEGORY_DSL>