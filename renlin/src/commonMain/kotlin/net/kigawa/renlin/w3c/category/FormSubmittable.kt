package net.kigawa.renlin.w3c.category

import net.kigawa.renlin.Html

//formのsubcategory
interface SubmittableFormContent : FormAssociatedContent

@Html
interface SubmittableFormContentDsl<CATEGORY_DSL : SubmittableFormContent> : FormAssociatedContentDsl<CATEGORY_DSL>