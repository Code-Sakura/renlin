package net.kigawa.renlin.sample

import net.kigawa.hakate.api.HakateInitializer
import net.kigawa.hakate.api.state.MutableState
import net.kigawa.renlin.component.component
import net.kigawa.renlin.css.*
import net.kigawa.renlin.tag.div
import net.kigawa.renlin.tag.fragment
import net.kigawa.renlin.tag.p
import net.kigawa.renlin.tag.style
import net.kigawa.renlin.tag.text
import net.kigawa.renlin.w3c.category.integration.FlowPhrasingIntegration
import net.kigawa.renlin.w3c.category.native.FlowContent
import net.kigawa.renlin.w3c.category.native.PhrasingContent
import net.kigawa.renlin.w3c.category.t
import net.kigawa.renlin.w3c.event.tag.onClick


class Sub {
    val state: MutableState<String> = HakateInitializer().newStateDispatcher().newState("state 0")
    private var isMenuOpen = false

    val display = div.component {
        div("hero-section") {
            t("Renlin")
            css {
                fontSize = 48.px
                height = 100.vh
                width = 100.percent
                textAlign = TextAlign.CENTER
                margin = 0.px
                padding = 0.px
                paddingBottom = 10.px
                display = Display.FLEX
                flexDirection = FlexDirection.COLUMN
                alignItems = AlignItems.CENTER
                justifyContent = JustifyContent.CENTER
            }
        }

        div("content-section") {
            div("welcome-card") {
                t("Welcome to Renlin Framework")
                css {
                    fontSize = 30.px
                    padding = 40.px
                    textAlign = TextAlign.CENTER
                    borderRadius = 12.px
                    maxWidth = 800.px
                    width = 100.percent
                    marginBottom = 40.px
                    marginLeft = 0.px
                    marginRight = 0.px
                }
            }

            div("feature-grid") {
                div("feature-card") {
                    t("⚡ Fast Performance")
                    p {
                        t("Built for speed and efficiency with modern web technologies.")
                    }
                    css {
                        padding = 30.px
                        margin = 20.px
                        borderRadius = 8.px
                        textAlign = TextAlign.CENTER
                        width = 280.px
                    }
                }

                div("feature-card") {
                    t("🎨 Beautiful Design")
                    p {
                        t("Clean and modern interface that adapts to your needs.")
                    }
                    css {
                        padding = 30.px
                        margin = 20.px
                        borderRadius = 8.px
                        textAlign = TextAlign.CENTER
                        width = 280.px
                    }
                }

                div("feature-card") {
                    t("Easy to Use")
                    p {
                        t("Simple and intuitive API for building amazing applications.")
                    }
                    css {
                        padding = 30.px
                        margin = 20.px
                        borderRadius = 8.px
                        textAlign = TextAlign.CENTER
                        width = 280.px
                    }
                }

                css {
                    display = Display.FLEX
                    flexWrap = FlexWrap.WRAP
                    maxWidth = 1200.px
                    width = 100.percent
                    padding = 40.px
                    justifyContent = JustifyContent.CENTER
                    marginLeft = 0.px
                    marginRight = 0.px
                }
            }

            css {
                width = 100.percent
                display = Display.FLEX
                flexDirection = FlexDirection.COLUMN
                alignItems = AlignItems.CENTER
            }
        }


    }

    val navigation = div.component {
        div("nav-bar") {
            div("nav-brand") {
                t("=")
                css {
                    fontSize = 34.px
                }
            }
            css {
                position = Position.FIXED
                top = 0.px
                left = 0.px
                width = 100.percent
                height = 60.px
                display = Display.FLEX
                justifyContent = JustifyContent.SPACE_BETWEEN
                alignItems = AlignItems.CENTER
                padding = 20.px
            }
        }
    }

    val footer = div.component { }

    val test = fragment<FlowContent>().component { }
    val test1 = fragment<PhrasingContent>().component { }
    val test2 = fragment<FlowPhrasingIntegration>().component { }
}