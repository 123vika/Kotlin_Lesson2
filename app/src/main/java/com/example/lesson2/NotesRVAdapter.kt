package com.example.lesson2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson2.Data.data.Note
import kotlinx.android.synthetic.main.item_note.view.*

class NotesRVAdapter: RecyclerView.Adapter<NotesRVAdapter.ViewHolder>(){

    var notes: List<Note> = listOf()
        set (value){
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_note, parent, false)
        )

    override fun getItemCount()= notes.size

    override fun onBindViewHolder(vh: ViewHolder, pos: Int) = vh.bind(notes[pos])

    class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){

        fun bind(note: Note) = with(itemView){
            tv_title.text = note.title
            tv_text.text = note.text
            setBackgroundColor(note.color)
        }
//                  2 способ
//        fun bind(note: Note){
//            itemView.tv_title.text = note.title
//            itemView.tv_text.text = note.text
//            itemView.setBackgroundColor(note.color)
//        }

    }
}