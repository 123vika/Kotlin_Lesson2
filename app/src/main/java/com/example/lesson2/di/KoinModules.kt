package com.example.lesson2.di

import com.example.lesson2.data.NotesRepository
import com.example.lesson2.data.provider.FireStoreProvider
import com.example.lesson2.data.provider.RemoteDataProvider
import com.example.lesson2.ui.main.MainViewModel
import com.example.lesson2.ui.note.NoteViewModel
import com.example.lesson2.ui.splash.SplashViewModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val appModule = module{
    single { FirebaseAuth.getInstance()}
    single { FirebaseFirestore.getInstance()}
    single { FireStoreProvider(get(), get())} bind RemoteDataProvider::class
    single { NotesRepository(get())}
}

val splashModule = module {
    viewModel {SplashViewModel(get())}
}

val mainModule = module {
    viewModel { MainViewModel(get()) }
}

val noteModule = module {
    viewModel {NoteViewModel(get())}
}