package net.kigawa.renlin.w3c.category

interface FlowPalpableSectioningIntersection : FlowContent, PalpableContent, SectioningContent
interface FlowPalpableSectioningDsl<CATEGORY_DSL : FlowPalpableSectioningIntersection> :
    FlowContentDsl<CATEGORY_DSL>