package com.example.bottomsheetrecyclerview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WordViewHolder(val view: View): RecyclerView.ViewHolder(view) {
    fun setData(word: String){
        val wordTV = view.findViewById<TextView>(R.id.word_tv)
        wordTV.text = word
    }
}