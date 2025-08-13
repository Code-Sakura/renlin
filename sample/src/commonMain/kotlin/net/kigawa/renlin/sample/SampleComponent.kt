@file:Suppress("unused")

package net.kigawa.renlin.sample

import net.kigawa.renlin.tag.div
import net.kigawa.renlin.tag.p
import net.kigawa.renlin.tag.text
import net.kigawa.renlin.w3c.category.t
import net.kigawa.renlin.w3c.event.tag.onClick

class SampleComponent(
    val name: String,
    val sub: Sub,
) {
    var update: (Int) -> Unit = {}

    val root = div.component {
        sub.navigation("navigation") {
        }
        // a
        sub.display("main-display") {
        }



    }
}