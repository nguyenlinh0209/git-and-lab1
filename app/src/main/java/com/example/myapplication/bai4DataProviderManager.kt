package com.example.myapplication

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

object Bai4DataProviderManager {

    fun handleDirection(direction: Direction) {
        try {
            when (direction) {
                Direction.NORTH -> {
                    println("Go North")
                }
                Direction.SOUTH -> {
                    println("Go South")
                }
                Direction.WEST -> {
                    println("Go West")
                }
                Direction.EAST -> {
                    println("Go East")
                }
            }
        } catch (exception: Exception) {
            println("Error: ${exception.message}")
        }
    }
}

fun main() {
    Bai4DataProviderManager.handleDirection(Direction.NORTH)
    Bai4DataProviderManager.handleDirection(Direction.EAST)
}
