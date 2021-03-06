package com.example.food_vision

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class NutritionalInquiry : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inquirypage)

        val nutInq = findViewById<ImageView>(R.id.photoButton)
        val photoBack = findViewById<ImageView>(R.id.photoBack)

        photoBack.setOnClickListener{
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
        }

    }
}