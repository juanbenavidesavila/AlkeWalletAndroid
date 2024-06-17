package com.example.alkewalletandroid.modelo.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.alkewalletandroid.modelo.AlkeWalletDao
import com.example.alkewalletandroid.modelo.entity.AlkeWalletEntity

@Database(entities = [AlkeWalletEntity::class], version = 1,exportSchema =  false)
abstract class  AlkeDataBase : RoomDatabase(){
    abstract fun alkeDao(): AlkeWalletDao

    companion object {
        @Volatile
        private var INSTANCE: AlkeDataBase? = null

        fun getInstance(context: Context): AlkeDataBase {
            return INSTANCE ?:synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AlkeDataBase::class.java,
                    "alkewallet_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}