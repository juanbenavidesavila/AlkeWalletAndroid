package com.example.alkewalletandroid

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        val volcerCuentaUsuario = findViewById<ImageView>(R.id.volver_cuenta)
        val volverCuentaUsuario2 = findViewById<TextView>(R.id.volver_cuenta2)
        volcerCuentaUsuario.setOnClickListener {
            val intent = Intent(this@MainActivity7, MainActivity5::class.java)
            startActivity(intent)
        }
        volverCuentaUsuario2.setOnClickListener {
            val intent = Intent(this@MainActivity7, MainActivity5::class.java)
            startActivity(intent)
        }
    }
}