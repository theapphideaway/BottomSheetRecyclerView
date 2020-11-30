package com.example.bottomsheetrecyclerview

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.localbroadcastmanager.content.LocalBroadcastManager


class MainFragment : Fragment() {

    val SELECTED_WORD = "SELECTED_WORD"

    private lateinit var selectedWordTV : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false).apply{
            val showBottomSheetBTN = findViewById<Button>(R.id.show_bottom_sheet_btn)
            selectedWordTV = findViewById(R.id.selected_word_tv)
            showBottomSheetBTN.setOnClickListener {
                BottomSheetFragment().show(requireActivity().supportFragmentManager, "words")
            }

        }
    }

    private val someBroadcastReceiver: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            val selectedWord = intent!!.getStringExtra(SELECTED_WORD)
            selectedWordTV.text = selectedWord
        }
    }

    override fun onResume() {
        super.onResume()
        LocalBroadcastManager.getInstance(context!!).registerReceiver(
            someBroadcastReceiver,
            IntentFilter(SELECTED_WORD)
        )
    }

    override fun onPause() {
        LocalBroadcastManager.getInstance(context!!).unregisterReceiver(someBroadcastReceiver)
        super.onPause()
    }
}