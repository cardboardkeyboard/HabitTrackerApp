package com.example.habittracker.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.habittracker.ui.theme.HabitTrackerTheme

@Database(entities = [TimeTable::class,Folder::class,File::class], version = 1)
@TypeConverters(Converters::class)
abstract class HabitTrackerDatabase : RoomDatabase() {
    abstract fun Dao(): Dao
    companion object{

        @Volatile
        private var INSTANCE: HabitTrackerDatabase? = null

        fun getInstance(context: Context): HabitTrackerDatabase {

            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        HabitTrackerDatabase::class.java,
                        "habitTrackerDatabase"
                    ).build()

                    INSTANCE = instance
                }
                return instance
            }
        }

    }
}