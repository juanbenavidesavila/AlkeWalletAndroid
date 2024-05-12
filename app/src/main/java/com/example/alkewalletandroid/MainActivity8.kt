package com.example.alkewalletandroid

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)
        val volverCuenta = findViewById<ImageView>(R.id.volver_cuenta)
        val volverCuenta2 = findViewById<TextView>(R.id.volver_cuenta2)
        volverCuenta.setOnClickListener {
            val intent = Intent(this@MainActivity8, MainActivity5::class.java)
            startActivity(intent)
        }
        volverCuenta2.setOnClickListener {
            val intent = Intent(this@MainActivity8, MainActivity5::class.java)
            startActivity(intent)
        }
    }
}