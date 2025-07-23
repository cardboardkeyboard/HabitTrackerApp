package com.example.habittracker.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity
data class TimeTable(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "day_val") val dayVal: Int,
    @ColumnInfo(name = "date") val date: Date
)