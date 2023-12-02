package com.example.gedit_hackaton

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gedit_hackaton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.incablecar.setOnClickListener {
            val intent= Intent(this, ReservationActivity::class.java)
            startActivity(intent)
        }

    }
}