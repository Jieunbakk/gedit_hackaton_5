package com.example.gedit_hackaton

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gedit_hackaton.databinding.ActivityMainBinding
import com.example.gedit_hackaton.databinding.ReservationPageBinding

class ReservationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ReservationPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var cntL=0
        var cntS=0
        binding.upBtn1.setOnClickListener{
            cntL+=1
            binding.cntpp.text=cntL.toString()
        }
        binding.downBtn1.setOnClickListener{
            if ( cntL <= 0) {
                cntL = 0
            }else{
                cntL-=1
            }
            binding.cntpp.text=cntL.toString()
        }
        binding.upBtn2.setOnClickListener {
            cntS+=1
            binding.cntpp2.text=cntS.toString()
        }
        binding.downBtn2.setOnClickListener {
            if ( cntS <= 0) {
                cntS = 0
            }else{
                cntS-=1
            }
            binding.cntpp2.text=cntS.toString()
        }
        binding.reserBtn.setOnClickListener {
            finish()
        }

    }
}