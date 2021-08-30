package com.github.coroutine

import kotlinx.coroutines.*
import java.util.concurrent.TimeUnit

/**
 *
 * @author HAN
 * @since 08-30-16:16
 * @version 1.0
 */
@DelicateCoroutinesApi
suspend fun main() {
    coroutineScopeTest()
}

suspend fun coroutineScopeTest() {
    coroutineScope {
        launch {
            delay(500L)
            println("task from nested launch, Thread: ${Thread.currentThread().name}")
        }
        delay(100L)
        println("task from coroutine scope, Thread: ${Thread.currentThread().name}")
    }
    println("coroutine scope is over, Thread: ${Thread.currentThread().name}")
}

@DelicateCoroutinesApi
suspend fun globalScopeTest() {
    val job = GlobalScope.launch {
        delay(1000L)
        println("GlobalScope.launch test")
    }
    println("main")
//    runBlocking {
//        delay(2000L)
//    }
    job.join()
}
