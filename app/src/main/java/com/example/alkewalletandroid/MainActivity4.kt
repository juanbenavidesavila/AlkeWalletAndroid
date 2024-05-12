package com.example.alkewalletandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val crearCuenta = findViewById<Button>(R.id.crear_cuenta)
        val cExistente = findViewById<TextView>(R.id.cuenta_existente)
        crearCuenta.setOnClickListener {
            val intent = Intent(this@MainActivity4, MainActivity5::class.java)
            startActivity(intent)
        }
        cExistente.setOnClickListener {
            val intent = Intent(this@MainActivity4, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}