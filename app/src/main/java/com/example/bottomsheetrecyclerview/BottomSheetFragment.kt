package com.example.bottomsheetrecyclerview

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class BottomSheetFragment : BottomSheetDialogFragment() {

    val words = arrayListOf<String>("One", "Two", "Three")

    val SELECTED_WORD = "SELECTED_WORD"
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bottom_sheet_fragment, container, false).apply{
            val wordRV = findViewById<RecyclerView>(R.id.word_rv)
            val adapter = WordAdapter(words){ selectedWord ->
                val selectedIntent = Intent(SELECTED_WORD)
                selectedIntent.putExtra(SELECTED_WORD, selectedWord)
                LocalBroadcastManager.getInstance(context).sendBroadcast(selectedIntent)
            }
            wordRV.adapter = adapter
            wordRV.layoutManager = LinearLayoutManager(requireContext())


        }
    }
}