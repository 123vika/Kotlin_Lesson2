package com.example.lesson2.ui.note

import com.example.lesson2.data.entity.Note
import com.example.lesson2.ui.base.BaseViewState

class NoteViewState(data: Data = Data(), error: Throwable? = null) : BaseViewState<NoteViewState.Data>(data, error){
    data class Data(val isDeleted: Boolean = false, val note: Note? = null)
}