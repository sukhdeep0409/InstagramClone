package com.example.instagramclone.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.instagramclone.R

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        supportActionBar?.title = "Login"
    }
}