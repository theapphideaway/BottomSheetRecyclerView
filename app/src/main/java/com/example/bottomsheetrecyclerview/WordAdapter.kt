package com.example.bottomsheetrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class WordAdapter(private val words: ArrayList<String>, val itemClick: (String) -> Unit): RecyclerView.Adapter<WordViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.dialog_list_item, parent, false)
        return WordViewHolder(inflater)
    }

    override fun getItemCount(): Int = words.count()

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        holder.setData(words[position])
        holder.itemView.setOnClickListener {
            itemClick(words[position])
        }
    }
}