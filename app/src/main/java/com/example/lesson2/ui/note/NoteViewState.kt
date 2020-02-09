package com.example.lesson2.ui.note

import com.example.lesson2.data.entity.Note
import com.example.lesson2.ui.base.BaseViewState

class NoteViewState (note: Note? = null, error: Throwable? = null) : BaseViewState<Note?>(note, error)