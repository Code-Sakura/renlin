package net.kigawa.renlin.category

import net.kigawa.renlin.Html
import net.kigawa.renlin.dsl.Dsl


interface  MetadataContent : ContentCategory {}

@Html
interface MetadataContentDsl<CATEGORY_DSL : MetadataContent> :
    Dsl<CATEGORY_DSL>