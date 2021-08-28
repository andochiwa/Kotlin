package com.github.syntax

import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random

/**
 *
 * @author HAN
 * @since 08-28-21:58
 * @version 1.0
 */
fun main() {
    ternaryTest(5, 10)
    whenTest(0)
    whenTest("CC")
    whenTest(listOf("a", "b"))
    whenTest(listOf("b", "1"))
}

// ternary
fun ternaryTest(a: Int, b: Int) {
    val max = if (a > b) a else b
    println("max: $max, a: $a, b: $b")
}

// when
fun whenTest(x: Any) {
    when (x) {
        is String -> println("x is String $x")
        is Int, Long, Double, Float -> {
            when (x) {
                0, 1 -> println("x == 0 or x == 1")
                2 -> println("x == 2")
                else -> println("x != 0, 1, 2")
            }
        }
        is List<*> -> {
            print("x is list, ")
            when {
                "1" in x -> println("1 in x")
                "2" in x -> println("2 in x")
                else -> println("1 and 2 not in x")
            }
        }
    }
}
