package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val viewModel: GameViewModel by viewModels()
    private var wordLists :MutableList<String> = mutableListOf()
    private lateinit var currentWord: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val letterKey = Bai3DetailActivity.LETTER
        val letterId = intent?.extras?.getString(letterKey).orEmpty()
        println("Letter ID: $letterId")
        var quantity : Int? = null
        quantity ?: 0
        quantity = 4
        quantity ?: 0

    }
}
