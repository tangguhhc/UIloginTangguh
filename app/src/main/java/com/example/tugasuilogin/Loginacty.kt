package com.example.tugasuilogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Loginacty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginacty)

        val secondActbutton = findViewById<TextView>(R.id.signup)
        secondActbutton.setOnClickListener{
            val Intent = Intent (this,MainActivity::class.java)
            startActivity(Intent)
        }
    }
}