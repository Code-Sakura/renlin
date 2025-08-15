package net.kigawa.renlin.w3c.attribute

import net.kigawa.renlin.tag.ADsl
import net.kigawa.renlin.tag.LinkDsl
import net.kigawa.renlin.tag.BaseDsl
import net.kigawa.renlin.tag.AreaDsl
import net.kigawa.renlin.w3c.attribute.value.Href

var ADsl.href: Href
    get() {
        return Href(dslStateData?.href ?: "")
    }
    set(value) {
        dslStateData?.href = value.url
    }

var LinkDsl.href: Href
    get() {
        return Href(dslStateData?.href ?: "")
    }
    set(value) {
        dslStateData?.href = value.url
    }

var BaseDsl.href: Href
    get() {
        return Href(dslStateData?.href ?: "")
    }
    set(value) {
        dslStateData?.href = value.url
    }

var AreaDsl.href: Href
    get() {
        return Href(dslStateData?.href ?: "")
    }
    set(value) {
        dslStateData?.href = value.url
    }