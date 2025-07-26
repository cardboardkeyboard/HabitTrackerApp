package com.example.habittracker.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import java.time.LocalDate
import java.util.Date

@Entity(
    indices = [Index(value = ["name","timeTableType"], unique = true)]
)
data class File(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "name") var name: String,
    @ColumnInfo(name = "timeTableType") val type: String,
    @ColumnInfo(name = "createdAt") val createdAt: LocalDate = LocalDate.now(),
    @ColumnInfo(name = "parentFolderId") var parentFolderId: Int?,
    ) {
    constructor(id: Int,name: String,type: String,parentFolderId: Int?) : this(id,name,type,
        LocalDate.now(),parentFolderId)
    constructor(name: String,type: String,parentFolderId: Int?) : this(0,name,type,
        LocalDate.now(),parentFolderId)
}