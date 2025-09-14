package com.example.myapplication

fun main() {
    val peopleAges = mutableMapOf("Fred" to 31, "Ann" to 23, "Barbara" to 42, "Joe" to 51)
    println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", "))
}
