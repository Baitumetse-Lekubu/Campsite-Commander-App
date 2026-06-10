/*
Student Number: ST10520899
Name: Baitumetse Botlhale Lekubu
*/
package com.example.campsitecommander

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        val txtSlogan = findViewById<TextView>(R.id.txtSlogan)

        // Slowly animate the slogan into view (Fade In over 1.5 seconds)
        txtSlogan.animate()
            .alpha(1.0f)
            .setDuration(1500)
            .setListener(null)

        // Hold display configuration execution, transition to Main Screen after 3 seconds (3000ms)
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Prevent backing into splash screen loop
        }, 3000)
    }
}