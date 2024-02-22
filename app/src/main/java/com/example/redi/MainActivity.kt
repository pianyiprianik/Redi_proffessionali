package com.example.redi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val redi_view = findViewById<ImageView>(R.id.imageView_splash)
        if (redi_view != null) {
            redi_view.animate().alpha(0f).duration = 2000
        }

        Thread {
            try {
                Thread.sleep(3000)
            }
            catch (e: InterruptedException) {
                e.printStackTrace()
            }
            val intent = Intent(this, Onboarding_1::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
            //clearOverrideActivityTransition()
        }.start()
    }
}