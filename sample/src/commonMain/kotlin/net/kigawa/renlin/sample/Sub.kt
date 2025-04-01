package net.kigawa.renlin.sample

import net.kigawa.renlin.tag.div
import net.kigawa.renlin.tag.p

class Sub {
    val display = div.component {
//        debug("display")
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
        div {
            key = "uuid aawaaaaaaaad"
            div {
                key = "uuid aadaaaaaaa"
            }
        }
        div {
            key = "uuid aawaaaaaaaa"
        }
    }
    val controller = div.component {
//        debug("controller")
        key = "uuid aaadaadadsaaaa"
    }
}