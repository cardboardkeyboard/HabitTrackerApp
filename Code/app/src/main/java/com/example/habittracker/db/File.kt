package com.example.habittracker.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity
data class File(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "timeTable") val timeTable: TimeTable,
    @ColumnInfo(name = "date") val date: Date,
    @ColumnInfo(name = "createdAt") val createdAt: Date = Date(System.currentTimeMillis()),
    @ColumnInfo(name = "parentFolderId") val parentFolderId: Int,
    )