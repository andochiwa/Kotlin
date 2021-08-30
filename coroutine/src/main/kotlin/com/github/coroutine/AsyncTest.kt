package com.github.coroutine

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlin.system.measureTimeMillis

/**
 *
 * @author HAN
 * @since 08-30-17:58
 * @version 1.0
 */
suspend fun main() {

    val timeWithoutAsync = withoutAsync()
    println("Completed without async in $timeWithoutAsync ms, Thread: ${Thread.currentThread().name}")
    val timeWithAsync = withAsync()
    println("Completed with async in $timeWithAsync ms, Thread: ${Thread.currentThread().name}")
}

suspend fun withAsync(): Long = coroutineScope {
    val asyncTest = AsyncTest()

    measureTimeMillis {
        val one = async { asyncTest.doSomethingUsefulOne() }
        val two = async { asyncTest.doSomethingUsefulTwo() }
        println("The answer is ${one.await() + two.await()}, Thread: ${Thread.currentThread().name}")
    }
}

suspend fun withoutAsync(): Long {
    val asyncTest = AsyncTest()
    return measureTimeMillis {
        val one = asyncTest.doSomethingUsefulOne()
        val two = asyncTest.doSomethingUsefulTwo()
        println("The answer is ${one + two}, Thread: ${Thread.currentThread().name}")
    }
}

class AsyncTest {

    suspend fun doSomethingUsefulOne(): Int {
        delay(1000L)
        return 13
    }

    suspend fun doSomethingUsefulTwo(): Int {
        delay(1000L)
        return 20
    }
}
