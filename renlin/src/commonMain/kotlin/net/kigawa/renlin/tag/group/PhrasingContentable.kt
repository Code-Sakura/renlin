package net.kigawa.renlin.tag.group

interface PhrasingContentable {
    operator fun <T : PhrasingContent> T.plus(txt: String) {}
}