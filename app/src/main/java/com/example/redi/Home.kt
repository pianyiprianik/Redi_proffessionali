package com.example.redi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.redi.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //binding.bNav.itemIconTintList = null



        /*
        android:id="@+id/bNav"
    android:layout_width="match_parent"
    android:layout_height="60dp"
    android:background="#FFFFFF"
    android:clipToPadding="false"
    android:padding="0dp"
    app:itemIconSize="40dp"
    app:itemIconTint="@drawable/bottom_nav_selector"
    app:itemRippleColor="#FFFFFF"
    app:itemTextColor="#FFFFFF"
    app:itemActiveIndicatorStyle="@style/active_item_style"
    app:labelVisibilityMode="unlabeled"
    app:layout_constraintBottom_toBottomOf="parent"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintStart_toStartOf="parent"
    app:menu="@menu/bottom_menu"
         */

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
                    Toast.makeText(applicationContext, "profile", Toast.LENGTH_SHORT).show()
                }
            }
            true
        }

    }
}