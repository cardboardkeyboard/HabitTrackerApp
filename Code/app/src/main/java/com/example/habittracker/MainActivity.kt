package com.example.habittracker

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.os.Handler
import android.util.Log
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.os.postDelayed
import com.example.habittracker.ui.theme.HabitTrackerTheme
//import java.util.logging.Handler

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler()   .postDelayed({
            val intent = Intent(this@MainActivity, StartScreen::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}
