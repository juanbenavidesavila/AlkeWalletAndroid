package com.example.alkewalletandroid.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.alkewalletandroid.R
import com.example.alkewalletandroid.viewModel.ToastCallback


class PantallaLogin : AppCompatActivity(), ToastCallback {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_login)

        val sesion = findViewById<Button>(R.id.sesion)
        val ncuenta = findViewById<TextView>(R.id.nueva_cuenta)


        sesion.setOnClickListener {
            val intent = Intent(this@PantallaLogin, MainActivity5::class.java)
            startActivity(intent)
        }
        ncuenta.setOnClickListener {
            val intent = Intent(this@PantallaLogin, MainActivity4::class.java)
            startActivity(intent)
        }
    }

    override fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}