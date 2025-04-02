package net.kigawa.renlin.sample

import kotlinx.browser.document
import kotlinx.browser.window
import net.kigawa.renlin.Entrypoint

fun main() {
    val root = document.getElementById("root") ?: throw Exception("Root not found")
    val sample = SampleComponent("sample", Sub())
    Entrypoint(root).render(sample.root)
    var i = 0
    window.setInterval({

                           i++
                           sample.update(i)
                       }, 1000, 1000)

}