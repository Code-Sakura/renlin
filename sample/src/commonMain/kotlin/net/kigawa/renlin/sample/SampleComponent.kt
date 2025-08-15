package net.kigawa.renlin.sample

import net.kigawa.renlin.component.component
import net.kigawa.renlin.tag.a
import net.kigawa.renlin.tag.div
import net.kigawa.renlin.tag.p
import net.kigawa.renlin.w3c.category.t

class SampleComponent(
    val name: String,
    val sub: Sub,
) {
    var update: (Int) -> Unit = {}

    val root = div.component {
        sub.navigation("navigation")
        sub.display("main-display") {
            div {
                t("aaaa")
                a {
                }
            }
            p {
            }
            a {}
        }


    }
}

