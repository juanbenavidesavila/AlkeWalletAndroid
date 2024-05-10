package com.example.alkewalletandroid

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

interface ToastCallback {
    fun showToast(message: String)
}

class LoginViewModel : ViewModel() , ToastCallback {
    var email = MutableLiveData<String?>()
    var password = MutableLiveData<String?>()

    var emailError = MutableLiveData<String?>()
    var passwordError = MutableLiveData<String?>()
    private var userMutableLiveData: MutableLiveData<User>?
    var callback: ToastCallback? = null

    init {
        userMutableLiveData = MutableLiveData()

    }

    fun onSingInClicked() {
        emailError.value = null
        passwordError.value = null

        val user = User(email.getValue(), password.getValue())
        if (email.getValue() == null || email.getValue()!!.isEmpty()){
            emailError.value = "Enter valid email address"
            return
        }
        if (password.getValue() == null || password.getValue()!!.isEmpty()){
            passwordError.value = "Enter password"
            return
        }
        if (!user.isPasswordLengthGreaterThan5){
            passwordError.value = "Password length should be greater than 5"
            return
        }

        userMutableLiveData!!.value = user
            showToast("Datos válidos")
        email.value = null
        password.value = null
    }

    val user : LiveData<User>

        get() {
            if(userMutableLiveData == null){
                userMutableLiveData = MutableLiveData()
            }
            return userMutableLiveData!!
        }

    override fun showToast(message: String) {
        callback?.showToast(message)
    }

}