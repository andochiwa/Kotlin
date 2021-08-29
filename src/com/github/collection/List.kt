package com.github.collection

import kotlin.concurrent.thread
import kotlin.math.log

/**
 *
 * @author HAN
 * @since 08-29-14:54
 * @version 1.0
 */
fun main() {
    val list = ArrayList<Int>()
    for (i in 0..10) {
        list.add(i)
    }
    println(list.joinToString())

    list.filter { it and 1 == 0 }.forEach{item -> print("filter: $item ")}
    println()

    list.forEach { item -> print("$item ") }

}
