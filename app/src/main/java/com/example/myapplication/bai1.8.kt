package com.example.myapplication

fun printBorder(border: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {
        print(border)
    }
    println()
}
fun main() {
    printBorder("*", 10)
}