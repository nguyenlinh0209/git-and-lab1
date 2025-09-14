package com.example.myapplication

class Dice(val numSides: Int) {
    var sides = 6

    fun roll() {
        val randomNumber = (1..sides).random()
        println(randomNumber)
    }
}

fun main() {
    val dice = Dice(6)
    dice.roll()
}
