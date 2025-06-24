package net.kigawa.renlin.category

import net.kigawa.renlin.Html
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.StatedDsl


interface  MetadataContent : ContentCategory {}

@Html
interface MetadataContentDsl<CATEGORY_DSL : MetadataContent> :
    StatedDsl<CATEGORY_DSL>