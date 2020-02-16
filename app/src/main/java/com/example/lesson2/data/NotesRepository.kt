package com.example.lesson2.data

import com.example.lesson2.data.entity.Note
import com.example.lesson2.data.provider.FireStoreProvider
import com.example.lesson2.data.provider.RemoteDataProvider


object NotesRepository{

    private val remoteProvider: RemoteDataProvider = FireStoreProvider()

    fun getNotes() = remoteProvider.subsrcibeToAllNotes()
    fun saveNote(note: Note) = remoteProvider.saveNote(note)
    fun getNoteById(id: String) = remoteProvider.getNoteById(id)
    fun getCurrentUser() = remoteProvider.getCurrentUser()
}

