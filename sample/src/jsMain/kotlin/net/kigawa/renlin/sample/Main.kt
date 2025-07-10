package net.kigawa.renlin.sample

import kotlinx.browser.document
import kotlinx.browser.window
import net.kigawa.hakate.api.HakateInitializer
import net.kigawa.renlin.Entrypoint

fun main() {
    val root = document.getElementById("root") ?: throw Exception("Root not found")
    val sub = Sub()
    val sample = SampleComponent("sample", sub)
    val dispatcher = HakateInitializer().newStateDispatcher()
    println("Hello, world!")
    Entrypoint(root).render(sample.root, dispatcher)
    println("Hello, world! 2")
    var i = 0
    window.setInterval(
        {
            i++
            sample.update(i)
            sub.state.set("state $i")
        },
        1000, 10000
    )

}