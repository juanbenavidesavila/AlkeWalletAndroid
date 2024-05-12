package com.example.alkewalletandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val sesion = findViewById<Button>(R.id.sesion)
        val ncuenta = findViewById<TextView>(R.id.nueva_cuenta)
        sesion.setOnClickListener {
            val intent = Intent(this@MainActivity3, MainActivity5::class.java)
            startActivity(intent)
        }
        ncuenta.setOnClickListener {
            val intent = Intent(this@MainActivity3, MainActivity4::class.java)
            startActivity(intent)
        }
    }
}