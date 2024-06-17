package com.example.alkewalletandroid.viewModel

import android.app.Application
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.alkewalletandroid.Cuenta
import com.example.alkewalletandroid.R
import com.example.alkewalletandroid.modelo.RepositoryCuenta
import com.example.alkewalletandroid.modelo.database.AlkeDataBase
import com.example.alkewalletandroid.view.MainActivity2
import com.example.alkewalletandroid.view.PantallaLogin
import kotlinx.coroutines.launch

class CuentaViewModel(application: Application) : AndroidViewModel(application) {
    private val cuentaRepository: RepositoryCuenta = RepositoryCuenta(AlkeDataBase.getInstance(application).alkeDao())

    private val _signupSuccess = MutableLiveData<Boolean>()
    val signupSuccess: LiveData<Boolean>
        get() = _signupSuccess

    private val _signupError = MutableLiveData<String>()
    val signupError: LiveData<String>
        get() = _signupError

    fun registerUser(
        name: String,
        lastname: String,
        email: String,
        password: String
    ) {
        /**
         * BODY FUNTION REGISTER USER
         */

}
    class MainActivity4 : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            val next = findViewById<ImageView>(R.id.logo)
            next.setOnClickListener {
                val intent = Intent(this@MainActivity4, PantallaLogin::class.java)
                startActivity(intent)
            }
        }
    }
}
