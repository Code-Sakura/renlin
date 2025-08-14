package net.kigawa.renlin.sample

import net.kigawa.renlin.component.component
import net.kigawa.renlin.tag.a
import net.kigawa.renlin.tag.div
import net.kigawa.renlin.tag.p

class SampleComponent(
    val name: String,
    val sub: Sub,
) {
    var update: (Int) -> Unit = {}

    val root = div.component {
        sub.navigation("navigation")
        // a
        sub.display("main-display") {
            div {
                a {
                }
            }
            p {}
            a {}
        }


    }
}