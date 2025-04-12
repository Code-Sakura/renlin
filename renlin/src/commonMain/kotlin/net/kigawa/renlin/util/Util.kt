package net.kigawa.renlin.util

inline fun <reified T> T.debug(vararg msgs: Any?) {
    println("${this::class}: ${msgs.joinToString(separator = ", ")}")
}