package net.kigawa.renlin.dsl.category

interface PhrasingContentDsl {
    var textContent: String?
    operator fun String.unaryPlus() {
        textContent = this
    }
}