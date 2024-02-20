package com.example.redi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Onboarding3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding3)

        val sign_up = findViewById<Button>(R.id.button_sign_up)
        val sign_in = findViewById<TextView>(R.id.textView_time)

        sign_up.setOnClickListener {
            val intent = Intent(this, Sign_Up::class.java)
            startActivity(intent)
        }

       sign_in.setOnClickListener {
            val intent = Intent(this, Sign_In::class.java)
            startActivity(intent)
        }
    }
}