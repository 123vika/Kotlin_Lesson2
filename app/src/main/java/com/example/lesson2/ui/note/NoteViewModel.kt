package com.example.lesson2.ui.note

import androidx.lifecycle.ViewModel
import com.example.lesson2.Data.NotesRepository
import com.example.lesson2.Data.entity.Note

class NoteViewModel: ViewModel() {
    private var pendingNote: Note? = null

    fun save (note: Note){
        pendingNote = note
    }
    override fun onCleared(){
        pendingNote?.let {
            NotesRepository.saveNote(it)
        }
    }
}