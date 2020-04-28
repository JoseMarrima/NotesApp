package com.example.notesapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "note_table")
data class Note(val title: String? = "",
                val content: String? = "",
                @PrimaryKey val id: String = UUID.randomUUID().toString())