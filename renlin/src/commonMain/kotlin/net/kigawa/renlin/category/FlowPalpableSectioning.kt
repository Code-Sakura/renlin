package net.kigawa.renlin.category

interface FlowPalpableSectioningIntersection : FlowContent, PalpableContent, SectioningContent
interface FlowPalpableSectioningDsl<CATEGORY_DSL : FlowPalpableSectioningIntersection> :
    FlowContentDsl<CATEGORY_DSL>