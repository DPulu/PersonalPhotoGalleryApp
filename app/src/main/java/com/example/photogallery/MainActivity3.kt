package com.example.photogallery

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

// Dustin Pulu
// PA Photo Gallery
// June 4, 2026
class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val imgLarge = findViewById<ImageView>(R.id.imgLarge)
        val imageId = intent.getIntExtra("IMAGE_ID", R.drawable.img_cat1)

        imgLarge.setImageResource(imageId)
    }
}