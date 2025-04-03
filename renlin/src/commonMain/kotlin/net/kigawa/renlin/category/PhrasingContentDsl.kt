package net.kigawa.renlin.category

import net.kigawa.renlin.dsl.Dsl

interface PhrasingContentDsl: Dsl, DslContentCategory {
    var textContent: String?
    operator fun String.unaryPlus() {
        textContent = this
    }
}