package com.example.alkewalletandroid.modelo

import androidx.lifecycle.LiveData
import com.example.alkewalletandroid.Cuenta
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import android.database.SQLException

/**
 * Repository para manejar las operaciones relacionadas con los usuarios en la base de datos.
 */
class RepositoryCuenta(private val alkeWalletDao: AlkeWalletDao) {

    val CuentaUsers: LiveData<List<Cuenta>> = alkeWalletDao.getAllCuentaUsers()


    suspend fun insertUser(user: Cuenta): Result<Unit> {
        return try {
            withContext(Dispatchers.IO) {
                alkeWalletDao.insert(user)
            }
            Result.success(Unit)
        } catch (e: SQLException) {
            Result.failure(e)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun updateUser(user: Cuenta): Result<Unit> {
        return try {
            withContext(Dispatchers.IO) {
                alkeWalletDao.update(user)
            }
            Result.success(Unit)
        } catch (e: SQLException) {
            Result.failure(e)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun deleteUser(userId: Int): Result<Unit> {
        return try {
            withContext(Dispatchers.IO) {
                alkeWalletDao.delete(userId)
            }
            Result.success(Unit)
        } catch (e: SQLException) {
            Result.failure(e)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    /**
     * Obtiene un usuario por su ID
     */
    fun getUserById(userId: Int): LiveData<Cuenta> {
        return alkeWalletDao.getUserById(userId)
    }

    /**
     * Obtiene un usuario por su correo
     */
    suspend fun getUserByEmail(email: String): Cuenta? {
        return withContext(Dispatchers.IO) {
            alkeWalletDao.getUserByEmail(email)
        }
    }
}

