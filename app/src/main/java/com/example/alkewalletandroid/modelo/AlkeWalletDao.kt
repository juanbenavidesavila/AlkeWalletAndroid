package com.example.alkewalletandroid.modelo

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.alkewalletandroid.Cuenta

@Dao
interface AlkeWalletDao {
    // Obtiene todos los usuarios
    @Query("SELECT * FROM cuenta_usuarios")
    fun getAllCuentaUsers(): LiveData<List<Cuenta>>

    // Inserta un nuevo usuario
    @Insert (onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(user: Cuenta)

    // Actualiza un usuario
    @Update
    suspend fun update(user: Cuenta)

    // Elimina un usuario por su ID
    @Query("DELETE FROM cuenta_usuarios WHERE id = :userId")
    suspend fun delete(userId: Int)

    // Obtiene un usuario por su ID
    @Query("SELECT * FROM cuenta_usuarios WHERE id = :userId")
    fun getUserById(userId: Int): LiveData<Cuenta>

    // Obtiene un usuario por correo
    @Query("SELECT * FROM cuenta_usuarios WHERE email = :email LIMIT 1")
    suspend fun getUserByEmail(email: String): Cuenta?
}