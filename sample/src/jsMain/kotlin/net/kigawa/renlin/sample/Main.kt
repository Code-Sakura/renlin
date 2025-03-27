package net.kigawa.renlin.sample

import kotlinx.browser.document
import net.kigawa.renlin.Entrypoint
import org.w3c.dom.HTMLElement

fun main() {
    val root = document.getElementById("root") ?: throw Exception("Root not found")
    if (root !is HTMLElement) throw Exception("Root not html element")
    val sample = SampleComponent("sample", Sub())
    Entrypoint(root).render(sample.root)
}