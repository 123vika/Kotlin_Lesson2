package com.example.lesson2.ui.splash

import com.example.lesson2.data.NotesRepository
import com.example.lesson2.data.entity.errors.NoAuthException
import com.example.lesson2.ui.base.BaseViewModel
import java.io.NotActiveException

class SplashViewModel () : BaseViewModel<Boolean?, SplashViewState>(){

    fun requestUser(){
        NotesRepository.getCurrentUser().observeForever{
            viewStateLiveData.value = it?.let{
                SplashViewState(authenticated = true)
            }?: let {
              SplashViewState(error = NoAuthException())
            }

        }
    }
}