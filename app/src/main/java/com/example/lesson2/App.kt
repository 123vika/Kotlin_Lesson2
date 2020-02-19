package com.example.lesson2

import android.app.Application
import com.example.lesson2.di.appModule
import com.example.lesson2.di.mainModule
import com.example.lesson2.di.noteModule
import com.example.lesson2.di.splashModule
import org.koin.android.ext.android.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin(this, listOf(appModule, splashModule, mainModule, noteModule))
    }
}