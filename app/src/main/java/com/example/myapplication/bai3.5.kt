package com.example.myapplication

fun main() {
    val peopleAges = mutableMapOf("Fred" to 30, "Ann" to 23)
    peopleAges.put("Barbara", 42)
    peopleAges["Joe"] = 51
    println(peopleAges)
}
