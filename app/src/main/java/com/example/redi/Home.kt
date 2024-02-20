package com.example.redi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.redi.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {
    private lateinit var binding:  ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bNav.setOnNavigationItemReselectedListener {
            when(it.itemId) {
                R.id.item1 -> {

                }
                R.id.item2 -> {

                }
                R.id.item3 -> {

                }
                R.id.item4 -> {

                }
            }
            true
        }

    }
}