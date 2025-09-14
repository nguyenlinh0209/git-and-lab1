package com.example.myapplication

import android.R.attr.radius
import kotlin.math.PI
// Lớp
abstract class Dwelling() {
    abstract val buildingMaterial: String
    abstract fun floorArea(): Double

    val floors : Int = 2

}


val numbers = listOf(1, 2, 3, 4, 5, 6)

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    println(numbers.size)


    println(numbers[0])

    listOf("red", "blue", "green").reversed()


    val entrees = mutableListOf<String>()

    entrees.add("spaghetti")

    entrees[0] = "lasagna"

    entrees.remove("lasagna")

    var index = 0
    while (index < numbers.size) {
        println(numbers[index])
        index++
    }

    val name = "Android"
    println(name.length)


    val number = 10
    val groups = 5
    val squareCabin = 5
    val capacity = 10
    val buildingMaterial = 50

    println("${number * groups} people")

    fun hasRoom(): Boolean {
        return true
    }
    with(squareCabin) {
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
    }

    val chuvi = kotlin.math.PI * radius * radius
    println("chuvi = $chuvi")



}


fun addToppings(vararg toppings: String)
{
    for (topping in toppings)
    {
        println(" $topping")
    }
}


