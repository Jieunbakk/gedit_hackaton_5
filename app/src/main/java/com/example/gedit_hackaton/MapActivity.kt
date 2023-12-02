package com.example.gedit_hackaton

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import com.example.gedit_hackaton.databinding.ActivityMainBinding
import com.example.gedit_hackaton.databinding.ActivityMapBinding

class MapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityMapBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Rbtn.setOnClickListener{
            val intent=Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.pin.setOnClickListener {
            binding.detail.visibility= View.VISIBLE
            binding.detailView.visibility=View.VISIBLE
            binding.panel.visibility=View.VISIBLE
        }




    }
}