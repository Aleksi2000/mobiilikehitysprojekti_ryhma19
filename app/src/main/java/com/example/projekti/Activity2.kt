package com.example.projekti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val actionBar = supportActionBar



        actionBar !!.title = "Second activity"
        actionBar.setDisplayHomeAsUpEnabled(true)

    }
}