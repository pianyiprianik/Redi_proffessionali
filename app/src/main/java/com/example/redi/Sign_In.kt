package com.example.redi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Sign_In : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val sign_up = findViewById<TextView>(R.id.textView_sign_in_welcome_back)
        val forgot_password = findViewById<TextView>(R.id.textView_forgot_password)

        sign_up.setOnClickListener {
            val intent = Intent(this, Sign_Up::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        forgot_password.setOnClickListener {
            val intent = Intent(this, Forgot_password::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }
    }
}