package net.kigawa.renlin.sample

import net.kigawa.renlin.tag.div
import net.kigawa.renlin.tag.p

class Sub {
    val display = div.component {
//        debug("display")
        +"display"
        key = "uuid aaaaaaaaa"
        div {
            key = "uuid aawaaaaaaa"
            +"display1"
            div {
                +"display1-1"
                key = "uuid aadaaaaaaa"
                p {
                    +"display1-1-1"
                    key = "uuid aaadaaaaaa"

                }
            }
        }
        div {
            +"display2"
            key = "uuid aawaaaaaaaad"
            div {
                +"display2-1"
                key = "uuid aadaaaaaaa"
            }
        }
        div {
            +"display3"
            key = "uuid aawaaaaaaaa"
        }
    }
    val controller = div.component {
//        debug("controller")
        +"controller"
        key = "uuid aaadaadadsaaaa"
    }
}