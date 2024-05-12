package com.example.alkewalletandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val registro = findViewById<Button>(R.id.entrar)
        val ccuenta = findViewById<TextView>(R.id.c_cuenta)
        registro.setOnClickListener {
            val intent = Intent(this@MainActivity2, MainActivity3::class.java)
            startActivity(intent)
        }
        ccuenta.setOnClickListener {
            val intent = Intent(this@MainActivity2, MainActivity4::class.java)
            startActivity(intent)
        }
    }
}