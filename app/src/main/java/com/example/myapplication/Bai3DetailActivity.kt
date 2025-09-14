package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Bai3DetailActivity : AppCompatActivity() {

    companion object {
        const val LETTER = "letter"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)
        val letterId = intent?.extras?.getString("letter").toString()
        println(letterId)

        val triple: (Int) -> Int = { a: Int -> a * 3 }
        println(triple(5))
    }

}

