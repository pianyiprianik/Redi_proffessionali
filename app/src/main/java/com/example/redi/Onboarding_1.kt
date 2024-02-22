package com.example.redi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Onboarding_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding1)

        val skip = findViewById<Button>(R.id.button_skip)
        val next = findViewById<Button>(R.id.button_next)

        skip.setOnClickListener {
            val intent = Intent(this, Onboarding3::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        next.setOnClickListener {
            val intent = Intent(this, Onboarding4::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }
    }
}