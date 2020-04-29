package com.example.notesapp.data

import javax.inject.Inject

class DefaultNoteRepository @Inject constructor(private val localSource: NoteDataSource): NoteRepository {
    override suspend fun insertNote(note: Note) {
        localSource.insertNote(note = note)
    }

    override fun getNotes() = localSource.getNotes()

    override suspend fun updateNote(note: Note) {
        localSource.updateNote(note = note)
    }

    override suspend fun deleteNoteById(noteId: String) {
        localSource.deleteNoteById(noteId = noteId)
    }
}