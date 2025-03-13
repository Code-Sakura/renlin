package net.kigawa.renlin.sample

import net.kigawa.renlin.tag.component
import net.kigawa.renlin.tag.div
import net.kigawa.renlin.tag.p

class SampleComponent(
    val name: String,
    val sub: Sub,
) {
    val root = div.component {
        p {
        }
        sub.display {}
        sub.controller {}
    }
}
