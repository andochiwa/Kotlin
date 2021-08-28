package com.github.syntax

/**
 *
 * @author HAN
 * @since 08-28-23:36
 * @version 1.0
 */
fun main() {
    forAsc(10)
    forDesc(10)
    forTestList(listOf("b", "z", 3))
}

fun forAsc(n: Int) {
    print("for asc: ")
    for (i in 0..n) {
        print("$i ")
    }
    println()
}

fun forDesc(n: Int) {
    print("for desc: ")
    for (i in n downTo 0) {
        print("$i ")
    }
    println()
}

fun forTestList(items: List<*>) {
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}
