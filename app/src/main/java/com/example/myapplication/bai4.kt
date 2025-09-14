package com.example.myapplication


import kotlinx.coroutines.*
 fun main() = runBlocking{
    suspend fun getValue(): Double {
        return withContext(Dispatchers.IO) {
            delay(1000)
            42.0
        }
    }

    val result = getValue()
    println("Result: $result")

    GlobalScope.launch {
        val output = getValue()
        println(output)
    }



    suspend fun processValue() {
        val value = getValue()
        processValue()
        println(value)
    }



    val job: Job = GlobalScope.launch {
        val output = getValue()
    }
    job.cancel()



}



