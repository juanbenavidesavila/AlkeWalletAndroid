package com.example.alkewalletandroid.view

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.alkewalletandroid.R

class MainActivity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main9)
        val volver = findViewById<ImageView>(R.id.perfil_cuenta)
        volver.setOnClickListener {
            val intent = Intent(this@MainActivity9, MainActivity5::class.java)
            startActivity(intent)
        }
    }
}