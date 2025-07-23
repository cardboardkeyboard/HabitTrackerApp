package com.example.habittracker.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity
data class Folder(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "createdAt") val createdAt: Date = Date(System.currentTimeMillis()),
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "parentFolderId") val parentFolderId: Int?

)