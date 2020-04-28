package com.example.notesapp.data

interface NoteRepository {
    suspend fun insertNote(note: Note)
    fun getNotes(): List<Note>
    suspend fun updateNote(note: Note)
    suspend fun deleteNoteById(noteId: String)
}