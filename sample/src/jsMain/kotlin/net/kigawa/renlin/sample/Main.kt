package net.kigawa.renlin.sample

import kotlinx.browser.document
import net.kigawa.renlin.Entrypoint

fun main() {
    val root = document.getElementById("root") ?: throw Exception("Root not found")
    val sample = SampleComponent("sample", Sub())
    Entrypoint(root).render(sample.root)
}