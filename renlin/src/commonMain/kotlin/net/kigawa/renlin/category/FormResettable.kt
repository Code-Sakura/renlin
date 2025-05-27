package net.kigawa.renlin.category

import net.kigawa.renlin.Html

//formのsubcategory
interface ResettableFormContent : FormAssociatedContent

@Html
interface ResettableFormContentDsl<CATEGORY_DSL : ResettableFormContent> : FormAssociatedContentDsl<CATEGORY_DSL>
