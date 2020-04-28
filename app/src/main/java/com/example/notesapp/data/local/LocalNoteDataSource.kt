package com.example.notesapp.data.local

import com.example.notesapp.data.Note
import com.example.notesapp.data.NoteDataSource
import javax.inject.Inject

class LocalNoteDataSource @Inject constructor(private val dao: NoteDao): NoteDataSource {
    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override fun getNotes(): List<Note> {
        return dao.getNotes()
    }

    override suspend fun updateNote(note: Note) {
        dao.updateNote(note)
    }

    override suspend fun deleteNoteById(noteId: String) {
        dao.deleteNoteById(noteId)
    }
}