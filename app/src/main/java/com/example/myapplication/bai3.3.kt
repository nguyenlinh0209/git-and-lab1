package com.example.myapplication

fun main() {
    val set1 = setOf(1, 2, 3)
    val set2 = setOf(3, 4, 5)

    println(set1.intersect(set2)) // [3]
    println(set1.union(set2))     // [1, 2, 3, 4, 5]
}
