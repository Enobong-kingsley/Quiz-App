package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ButtonSignIn = findViewById<Button>(R.id.signIn)

        ButtonSignIn.setOnClickListener {
            intent = Intent(this, StartActivity :: class.java)
            startActivity(intent)
        }

    }
}