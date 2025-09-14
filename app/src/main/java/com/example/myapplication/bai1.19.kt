package com.example.myapplication

class Dice1(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}

fun main() {
    val dice = Dice(6)
    println("Ket qua: ${dice.roll()}")
}
