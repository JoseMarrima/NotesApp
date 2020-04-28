package com.example.notesapp.data.local

import androidx.room.*
import com.example.notesapp.data.Note

@Dao
interface NoteDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    @Query("SELECT * FROM note_table")
    fun getNotes(): List<Note>

    @Update
    suspend fun updateNote(note: Note)

    @Query("DELETE FROM note_table WHERE id = :noteId")
    suspend fun deleteNoteById(noteId: String)
}