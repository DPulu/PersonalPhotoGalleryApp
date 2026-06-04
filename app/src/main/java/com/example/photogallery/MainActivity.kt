package com.example.photogallery

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

// Dustin Pulu
// PA Photo Gallery
// June 4, 2026
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler(Looper.getMainLooper()).postDelayed(
            {
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
                finish()
            },
            3000,
        )

    }
}