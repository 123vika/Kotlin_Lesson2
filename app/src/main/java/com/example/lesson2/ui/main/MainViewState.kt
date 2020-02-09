package com.example.lesson2.ui.main

import com.example.lesson2.data.entity.Note
import com.example.lesson2.ui.base.BaseViewState

class MainViewState (val notes: List<Note>? = null, error: Throwable? = null): BaseViewState<List<Note>?>(notes, error)