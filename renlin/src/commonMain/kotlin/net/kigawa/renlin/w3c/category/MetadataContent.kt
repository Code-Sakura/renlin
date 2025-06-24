package net.kigawa.renlin.w3c.category

import net.kigawa.renlin.Html
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.StatedDsl


interface  MetadataContent : ContentCategory {}

@Html
interface MetadataContentDsl<CATEGORY_DSL : MetadataContent> :
    StatedDsl<CATEGORY_DSL>