package com.example.myapplication

fun roll(): Int {
    val randomNumber = (1..6).random()
    return randomNumber
}
fun main(){
    val kq = roll()
    println("Ket qua tung xuc xac: $kq")
}