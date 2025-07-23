package com.example.habittracker.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [TimeTable::class,Folder::class,File::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}