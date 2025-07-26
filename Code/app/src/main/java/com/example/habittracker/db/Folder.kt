package com.example.habittracker.db

import java.time.LocalDate
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.example.habittracker.db.File

@Entity(
    indices = [Index(value = ["name"], unique = true)]
)
data class Folder(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name = "createdAt")
    val createdAt: LocalDate = LocalDate.now(),
    @ColumnInfo(name = "name")
    var name: String,
    @ColumnInfo(name = "parentFolderId")
    var parentFolderId: Int?
){
    constructor(id: Int,name: String,parentFolderId: Int?) : this(id,
        LocalDate.now(),name, parentFolderId)
    constructor(name: String,parentFolderId: Int?) : this(0,
        LocalDate.now(),name, parentFolderId)
}