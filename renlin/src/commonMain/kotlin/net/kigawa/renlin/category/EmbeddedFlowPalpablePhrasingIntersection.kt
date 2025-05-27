package net.kigawa.renlin.category

interface EmbeddedFlowPalpablePhrasingIntersection : EmbeddedContent, FlowContent, PalpableContent, PhrasingContent
interface EmbeddedFlowPalpablePhrasingDsl<CATEGORY_DSL : EmbeddedFlowPalpablePhrasingIntersection> :
    FlowContentDsl<CATEGORY_DSL>