package net.kigawa.renlin.sample

import net.kigawa.renlin.tag.div
import net.kigawa.renlin.tag.p

class SampleComponent(
    val name: String,
    val sub: Sub,
) {
    val root = div.component {
//        debug("root")
        key = "uuid aaaddasdawaadadssdasaaaa"
        repeat(10) {
            p {
                key = "uuid 1"
            }
        }
        sub.display {
            key = "uuid 2"
        }
        sub.display {
            key = "uuid 3"
        }
        sub.controller {
            key = "uuid 4"
        }
        p {
            key = "uuid 5"
        }
    }
}
