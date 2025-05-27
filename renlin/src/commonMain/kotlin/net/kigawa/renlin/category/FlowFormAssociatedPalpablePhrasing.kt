package net.kigawa.renlin.category

interface FlowFormAssociatedPalpablePhrasingIntersection : FlowContent, FormAssociatedContent, PalpableContent, PhrasingContent
interface FlowFormAssociatedPalpablePhrasingDsl<CATEGORY_DSL : FlowFormAssociatedPalpablePhrasingIntersection> :
    FlowContentDsl<CATEGORY_DSL>