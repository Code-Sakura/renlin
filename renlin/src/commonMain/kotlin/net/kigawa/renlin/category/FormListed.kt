package net.kigawa.renlin.category

import net.kigawa.renlin.Html

//formのsubcategory
interface ListedFormContent : FormAssociatedContent

@Html
interface ListedFormContentDsl<CATEGORY_DSL : ListedFormContent> : FormAssociatedContentDsl<CATEGORY_DSL>