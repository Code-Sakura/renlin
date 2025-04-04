package net.kigawa.renlin.category

import net.kigawa.renlin.dsl.Dsl

interface PhrasingContentDsl<CONTENT_CATEGORY : PhrasingContent> : Dsl<CONTENT_CATEGORY> {
    var textContent: String?
    operator fun String.unaryPlus() {
        textContent = this
    }
}

interface PhrasingContent : ContentCategory