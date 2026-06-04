package com.example.photogallery

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

// Dustin Pulu
// PA Photo Gallery
// June 4, 2026
class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val imgCat1 = findViewById<ImageView>(R.id.imgCat1)
        val imgCat2 = findViewById<ImageView>(R.id.imgCat2)
        val imgCat3 = findViewById<ImageView>(R.id.imgCat3)
        val imgCat4 = findViewById<ImageView>(R.id.imgCat4)
        val imgCat5 = findViewById<ImageView>(R.id.imgCat5)
        val imgCat6 = findViewById<ImageView>(R.id.imgCat6)

        imgCat1.setOnClickListener { openImage(R.drawable.img_cat1) }
        imgCat2.setOnClickListener { openImage(R.drawable.img_cat2) }
        imgCat3.setOnClickListener { openImage(R.drawable.img_cat3) }
        imgCat4.setOnClickListener { openImage(R.drawable.img_cat4) }
        imgCat5.setOnClickListener { openImage(R.drawable.img_cat5) }
        imgCat6.setOnClickListener { openImage(R.drawable.img_cat6) }
    }

    private fun openImage(imageId: Int) {
        val intent = Intent(this, MainActivity3::class.java)
        intent.putExtra("IMAGE_ID", imageId)
        startActivity(intent)
    }
}