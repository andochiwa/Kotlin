package com.github.coroutine

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 *
 * @author HAN
 * @since 08-30-19:48
 * @version 1.0
 */
fun main() {
    val channel = Channel<Int>()
    runBlocking {
        launch {
            for (x in 0..9) {
                channel.send(x * x)
            }
        }
        repeat(10) {
            println(channel.receive())
        }
        println("Done")
    }
}
