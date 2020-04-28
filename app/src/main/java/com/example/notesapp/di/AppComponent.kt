package com.example.notesapp.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component

@Component
interface AppComponent {
    // Factory to create instances of the AppComponent
    @Component.Factory
    interface Factory {
        // With @BindsInstance, the Context passed in will be available in the graph
        fun create(@BindsInstance context: Context): AppComponent
    }
}