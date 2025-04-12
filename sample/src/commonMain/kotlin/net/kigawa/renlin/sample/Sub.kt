package net.kigawa.renlin.sample

import net.kigawa.hakate.api.HakateInitializer
import net.kigawa.hakate.api.state.MutableState
import net.kigawa.renlin.category.FlowContent
import net.kigawa.renlin.category.FlowPhrasingIntersection
import net.kigawa.renlin.category.PhrasingContent
import net.kigawa.renlin.category.t
import net.kigawa.renlin.tag.div
import net.kigawa.renlin.tag.fragment
import net.kigawa.renlin.tag.p

class Sub {
    val state: MutableState<String> = HakateInitializer().newStateDispatcher().newState("state")

    init {
        HakateInitializer().newStateDispatcher().useState {
//            state.collect { debug("collect $it") }
        }
    }

    val display = div.component {
//        debug("display")
        t("display")
        key = "uuid aaaaaaaaa"
        div {
            key = "uuid aawaaaaaaa"
            t("display1")
            div {
                val value = state.useValue()
//            debug("value = $value")
                t("display1-1")
                key = "uuid aadaaaaaaa"
                p {
                    t("display1-1-1 $value")
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