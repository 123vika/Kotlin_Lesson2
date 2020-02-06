package com.example.lesson2.ui.main

import com.example.lesson2.Data.entity.Note

data class MainViewState (val notes: List<Note>)//в реальной жизни будут все данные,
                                                // которые нужны нашему экрану