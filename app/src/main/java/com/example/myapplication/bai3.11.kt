package com.example.myapplication

fun main() {
    val number: Int? = 10
    number?.let {
        println("Number is $it")
    }
}
