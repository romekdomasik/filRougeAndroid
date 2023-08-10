package com.example.filrougeandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.filrougeandroid.databinding.ActivityAutheticationBinding

class AutheticationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAutheticationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAutheticationBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}