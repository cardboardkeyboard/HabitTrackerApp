package com.example.habittracker.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import java.time.LocalDate

@Entity(
    indices = [Index(value = ["date","type"], unique = true)]
)
data class TimeTable(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "day_val") var dayVal: Int,
    @ColumnInfo(name = "date") val date: LocalDate,
    @ColumnInfo(name = "type") var type: String
){
    constructor(dayVal: Int,date: LocalDate,type:String): this(0,dayVal,date,type)
}