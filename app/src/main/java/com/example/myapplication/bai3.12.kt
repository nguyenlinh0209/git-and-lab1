package com.example.myapplication

class Person {
    var name: String = ""
    var age: Int = 0
}

fun main() {
    val person = Person().apply {
        name = "Alice"
        age = 20
    }
    println("${person.name}, ${person.age}")
}
