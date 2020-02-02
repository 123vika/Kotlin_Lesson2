package com.example.lesson2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lesson2.Data.data.NotesRepository

class MainViewModel():ViewModel(){
    private val viewStateLiveData: MutableLiveData<MainViewState> = MutableLiveData()//можно поставить
// несколько разных viewStateLiveData для разных целей(аватарки, стринги,и т.д)

    init {
        viewStateLiveData.value = MainViewState(NotesRepository.getNotes())
    }

    fun viewState(): LiveData<MainViewState> = viewStateLiveData

    override fun onCleared(){
        super.onCleared()
        println("onCleared")
    }
}