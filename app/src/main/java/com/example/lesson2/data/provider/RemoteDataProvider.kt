package com.example.lesson2.data.provider

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.lesson2.data.entity.Note
import com.example.lesson2.data.entity.User
import com.example.lesson2.data.model.NoteResult


interface RemoteDataProvider {
    fun subscrcibeToAllNotes(): LiveData<NoteResult>
    fun getNoteById(id: String): LiveData<NoteResult>
    fun saveNote(note: Note): LiveData<NoteResult>
    fun getCurrentUser(): MutableLiveData<User?>
    fun deleteNote(noteId: String): LiveData<NoteResult>
}