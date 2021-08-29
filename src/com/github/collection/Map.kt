package com.github.collection

/**
 *
 * @author HAN
 * @since 08-29-16:09
 * @version 1.0
 */
fun main() {
    val map = mutableMapOf<String, Any>().apply {
        this["1"] = "one"
        this["2"] = "two"
        this["else"] = 10
    }
    map.remove("2")
    println(map["3"]?.equals("one") ?: false)
    println(map["1"]?.equals("one") ?: false)
    map.forEach { (k, v) -> println("k: $k, v: $v") }
}
