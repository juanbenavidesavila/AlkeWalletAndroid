package com.example.alkewalletandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val perfil = findViewById<ImageView>(R.id.img_perfil)
        val enviar = findViewById<Button>(R.id.enviar_dinero)
        val ingresar = findViewById<Button>(R.id.ingresar_dinero)
        perfil.setOnClickListener {
            val intent = Intent(this@MainActivity5, MainActivity9::class.java)
            startActivity(intent)
        }
        enviar.setOnClickListener {
            val intent = Intent(this@MainActivity5, MainActivity8::class.java)
            startActivity(intent)
        }
        ingresar.setOnClickListener {
            val intent = Intent(this@MainActivity5, MainActivity7::class.java)
            startActivity(intent)
        }
    }
}