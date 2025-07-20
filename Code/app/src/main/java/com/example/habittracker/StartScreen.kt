package com.example.habittracker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class StartScreen : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_screen)

        button = findViewById(R.id.goToHome)

        button.setOnClickListener {
            val intent = Intent(this@StartScreen,Home::class.java)
            startActivity(intent)
        }
    }
}