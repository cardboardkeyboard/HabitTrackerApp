package com.example.habittracker.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import java.time.LocalDate

@Dao
interface Dao {
    @Insert
    fun insertFile(file: File)

    @Insert
    fun insertTimeTable(timeTable: TimeTable)

    @Insert
    fun insertFolder(folder: Folder)

    @Query("SELECT * FROM TimeTable WHERE type =:type AND date=:date")
    fun getTimeTableRowByTypeAndDate(type: String,date: LocalDate): TimeTable


}