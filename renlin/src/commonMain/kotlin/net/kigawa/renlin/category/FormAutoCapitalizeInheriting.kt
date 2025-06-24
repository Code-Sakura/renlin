package net.kigawa.renlin.category

import net.kigawa.renlin.Html

//formのsubcategory
interface AutocapitalizeInheritingFormContent : FormAssociatedContent

@Html
interface AutocapitalizeInheritingFormContentDsl<CATEGORY_DSL : AutocapitalizeInheritingFormContent> : FormAssociatedContentDsl<CATEGORY_DSL>