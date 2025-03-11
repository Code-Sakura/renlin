package net.kigawa.renlin.sample

import net.kigawa.renlin.Tags.Companion.div
import net.kigawa.renlin.Tags.Companion.p

class SampleComponent(
    val name: String,
    val sub: Sub,
) {
    val root = div.component {
        p {
        }
        sub.display()
        sub.controller()
    }
}
