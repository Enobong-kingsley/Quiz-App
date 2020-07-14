package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        val ButtonStartQuiz = findViewById<Button>(R.id.startQuiz)

        ButtonStartQuiz.setOnClickListener {
            intent = Intent(this, Categories::class.java)
            startActivity(intent)
        }
    }
}