package com.example.myapplication

class Game {
    private var _currentWord = "test"
    val currentWord: String
        get() = _currentWord
}

fun main() {
    val game = Game()
    println(game.currentWord)
}
