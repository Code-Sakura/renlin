package net.kigawa.renlin.sample

import net.kigawa.renlin.category.FlowContent
import net.kigawa.renlin.category.FlowPhrasingIntersection
import net.kigawa.renlin.category.PhrasingContent
import net.kigawa.renlin.category.t
import net.kigawa.renlin.tag.div
import net.kigawa.renlin.tag.fragment
import net.kigawa.renlin.tag.p

class Sub {
    val display = div.component {
//        debug("display")
        t("display")
        key = "uuid aaaaaaaaa"
        div {
            key = "uuid aawaaaaaaa"
            t("display1")
            div {
                t("display1-1")
                key = "uuid aadaaaaaaa"
                p {
                    t("display1-1-1")
                    key = "uuid aaadaaaaaa"

                }
            }
        }
        div {
            t("display2")
            key = "uuid aawaaaaaaaad"
            div {
                t("display2-1")
                key = "uuid aadaaaaaaa"
            }
        }
        div {
            t("display3")
            key = "uuid aawaaaaaaaa"
        }
    }
    val controller = div.component {
//        debug("controller")
        t("controller")
        key = "uuid aaadaadadsaaaa"
    }
    val test = fragment<FlowContent>().component { }
    val test1 = fragment<PhrasingContent>().component { }
    val test2 = fragment<FlowPhrasingIntersection>().component { }
}