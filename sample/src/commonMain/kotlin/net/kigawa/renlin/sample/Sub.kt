package net.kigawa.renlin.sample

import net.kigawa.renlin.tag.div
import net.kigawa.renlin.tag.p

class Sub {
    val display = div.component {
        key = "uuid aaaaaaaaa"
        div {
            key = "uuid aawaaaaaaa"
            div {
                key = "uuid aadaaaaaaa"
                p {
                    key = "uuid aaadaaaaaa"

                }
            }
        }
    }
    val controller = div.component {
        key = "uuid aaadaadadsaaaa"
    }
}