package com.syntax.hemmerich.batch010intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.syntax.hemmerich.batch010intents.databinding.ActivityHomeBinding
import com.syntax.hemmerich.batch010intents.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val text = intent.extras?.getString("textKEY")

        if(text != null){
            binding.edHome.text = text
        }

    }
}