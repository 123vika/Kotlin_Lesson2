package com.example.lesson2.data

import com.example.lesson2.data.entity.Note
import com.example.lesson2.data.provider.RemoteDataProvider


class NotesRepository(val remoteProvider: RemoteDataProvider){

    fun getNotes() = remoteProvider.subscrcibeToAllNotes()
    fun saveNote(note: Note) = remoteProvider.saveNote(note)
    fun getNoteById(id: String) = remoteProvider.getNoteById(id)
    fun getCurrentUser() = remoteProvider.getCurrentUser()
    fun deleteNote(id: String)= remoteProvider.deleteNote(id)
}