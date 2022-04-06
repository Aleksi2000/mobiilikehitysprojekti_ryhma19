package com.example.projekti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val selectHauki = findViewById<ImageButton>(R.id.select1)


        selectHauki.setOnClickListener{
            val intent = Intent(this,Activity2::class.java)
            startActivity(intent)
        }
    }
}

