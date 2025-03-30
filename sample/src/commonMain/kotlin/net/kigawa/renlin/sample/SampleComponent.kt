package net.kigawa.renlin.sample

import net.kigawa.renlin.tag.div
import net.kigawa.renlin.tag.p

class SampleComponent(
    val name: String,
    val sub: Sub,
) {
    val root = div.component {
        key = "uuid aaaddasdawaadadssdasaaaa"
        repeat(10) {
            p {
                key = "uuid aaaddasdawaadadsaaaa"
            }
        }
        sub.display {
            key = "uuid aaadaadadadsaaaa"
        }
        sub.controller {
            key = "uuid aaadaadadsaaaaaaaa"
        }
    }
}
