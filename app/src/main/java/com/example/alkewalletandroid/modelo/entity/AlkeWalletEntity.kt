package com.example.alkewalletandroid.modelo.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cuenta_usuarios")
data class AlkeWalletEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var name: String,
    var lastname: String,
    var email: String,
    var password: String,
)