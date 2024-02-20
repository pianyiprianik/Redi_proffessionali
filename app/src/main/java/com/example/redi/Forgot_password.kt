package com.example.redi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Forgot_password : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val send_otp = findViewById<Button>(R.id.button_send_otp)
        val sign_in = findViewById<TextView>(R.id.textView_sign_in_welcome_back)

        //sign_up.setOnClickListener {
        // val intent = Intent(this, Sign_Up::class.java)
        // startActivity(intent)
        //}

        sign_in.setOnClickListener {
            val intent = Intent(this, Sign_In::class.java)
            startActivity(intent)
        }
    }
}