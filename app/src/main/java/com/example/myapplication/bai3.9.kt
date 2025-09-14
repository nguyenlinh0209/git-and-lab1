package com.example.myapplication

fun main() {
    val peopleAges = mutableMapOf("Fred" to 31, "Ann" to 23, "Barbara" to 42, "Joe" to 51)
    val filteredNames = peopleAges.filter { it.key.length < 4 }
    println(filteredNames) // {Ann=23, Joe=51}
}
