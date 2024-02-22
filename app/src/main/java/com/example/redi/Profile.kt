package com.example.redi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.redi.databinding.ActivityHomeBinding
import com.example.redi.databinding.ActivityProfileBinding

class Profile : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bNav.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.item1 -> {
                    val intent = Intent(this, Home::class.java)
                    startActivity(intent)
                    overridePendingTransition(0, 0)
                }
                R.id.item2 -> {

                }
                R.id.item3 -> {

                }
                R.id.item4 -> {
                    val intent = Intent(this, Profile::class.java)
                    startActivity(intent)
                    overridePendingTransition(0, 0)
                }
            }
            true
        }

    }
}