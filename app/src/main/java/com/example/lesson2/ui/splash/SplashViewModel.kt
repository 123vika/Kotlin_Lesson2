package com.example.lesson2.ui.splash

import com.example.lesson2.data.NotesRepository
import com.example.lesson2.data.entity.errors.NoAuthException
import com.example.lesson2.ui.base.BaseViewModel

class SplashViewModel (private val notesRepository: NotesRepository ) : BaseViewModel<Boolean?, SplashViewState>(){

    fun requestUser(){
        notesRepository.getCurrentUser().observeForever{
            viewStateLiveData.value = it?.let{
                SplashViewState(authenticated = true)
            }?: let {
              SplashViewState(error = NoAuthException())
            }

        }
    }
}