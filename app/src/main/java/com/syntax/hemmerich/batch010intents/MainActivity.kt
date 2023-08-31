package com.syntax.hemmerich.batch010intents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.syntax.hemmerich.batch010intents.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //explicit Intent
        binding.btnToHome.setOnClickListener {
            val intent = Intent(this,HomeActivity::class.java)
            intent.putExtra("textKEY",binding.edInput.text.toString())
            this.startActivity(intent)
        }

        //implicit Intent
        binding.btnShare.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.putExtra(Intent.EXTRA_TEXT,binding.edInput.text.toString())
            shareIntent.type = "text/plain"
            val chooserIntent = Intent.createChooser(shareIntent,"Test")
            this.startActivity(chooserIntent)
        }

        binding.btnCall.setOnClickListener {
            val callIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel: +491111111"))
            this.startActivity(callIntent)
        }

    }
}