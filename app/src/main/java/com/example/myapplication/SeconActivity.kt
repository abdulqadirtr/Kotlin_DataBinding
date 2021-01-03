package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivitySubBinding

class SeconActivity: AppCompatActivity (){

    private lateinit var binding: ActivitySubBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =  DataBindingUtil.setContentView(this, R.layout.activity_sub)
        val boxNames: BoxNames = BoxNames("First Box", "Second Box" , "Third Box")
        binding.boxNames = boxNames
        binding.invalidateAll()

    }
}