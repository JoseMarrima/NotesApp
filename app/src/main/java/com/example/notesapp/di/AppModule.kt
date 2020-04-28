package com.example.notesapp.di

import android.content.Context
import androidx.room.Room
import com.example.notesapp.data.DefaultNoteRepository
import com.example.notesapp.data.NoteDataSource
import com.example.notesapp.data.NoteRepository
import com.example.notesapp.data.local.LocalNoteDataSource
import com.example.notesapp.data.local.NoteDatabase
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [AppModuleBinds::class])
class AppModule {
    @Singleton
    @Provides
    fun provideDataBase(context: Context): NoteDatabase {
        return Room.databaseBuilder(
            context.applicationContext,
            NoteDatabase::class.java,
            "notes_db.db"
        ).build()
    }

}

abstract class AppModuleBinds {
    @Singleton
    @Binds
    abstract fun provideDataSource(dataSource: LocalNoteDataSource): NoteDataSource

    @Singleton
    @Binds
    abstract fun provideRepository(repository: DefaultNoteRepository): NoteRepository
}