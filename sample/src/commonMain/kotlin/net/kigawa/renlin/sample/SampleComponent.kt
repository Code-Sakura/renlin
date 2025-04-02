package net.kigawa.renlin.sample

import net.kigawa.renlin.tag.div
import net.kigawa.renlin.tag.p
import net.kigawa.renlin.tag.text

class SampleComponent(
    val name: String,
    val sub: Sub,
) {
    lateinit var update: (Int) -> Unit
    val root = div.component {
//        debug("root")
        key = "uuid aaaddasdawaadadssdasaaaa"
        +"test root"
        div {
            key = "uuid 1"
            text {
                key = "uuid 1-1"
                update = {
                    +"repeat $it"
                }
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
