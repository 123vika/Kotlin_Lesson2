package com.example.lesson2.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lesson2.Data.NotesRepository

class MainViewModel(): ViewModel(){
    private val viewStateLiveData: MutableLiveData<MainViewState> = MutableLiveData()//можно поставить
// несколько разных viewStateLiveData для разных целей(аватарки, стринги,и т.д)

    init {
        NotesRepository.getNotes().observeForever{notes ->
            viewStateLiveData.value = viewStateLiveData.value?.copy(notes = notes) ?: MainViewState(notes)
            // если value не null, вызовется copy, иначе(?:) вызывается MainViewState(it)(создаёт новый)
        }
    }

    fun viewState(): LiveData<MainViewState> = viewStateLiveData

    override fun onCleared(){
        super.onCleared()
        println("onCleared")
    }
}