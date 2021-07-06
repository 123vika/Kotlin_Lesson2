package com.example.lesson2.Data.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
data class Note (
    val id: String,
    val title: String = "",
    val text: String = "",
    val color: Color = Color.WHITE,
    val lastChanged: Date = Date()
):Parcelable{

    override fun equals(other: Any?): Boolean{
        if (this === other) return true  // рефересное равенство. Ссылки на объекты равны.
        if (javaClass != other?.javaClass)return  false // убедились, что это тот же самый класс

        other as Note    // дальше other можно воспринимать как Note

        if (id != other.id) return false
        return true
    }

    enum class Color {
        WHITE,
        YELLOW,
        GREEN,
        BLUE,
        RED,
        VIOLET,
        PINK
    }
}

