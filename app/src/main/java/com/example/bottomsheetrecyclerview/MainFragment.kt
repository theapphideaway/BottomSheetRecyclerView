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
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.localbroadcastmanager.content.LocalBroadcastManager


class MainFragment : Fragment() {

    private lateinit var selectedWordTV : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false).apply{
            val bottomSheet = BottomSheetFragment()
            val showBottomSheetBTN = findViewById<Button>(R.id.show_bottom_sheet_btn)
            selectedWordTV = findViewById(R.id.selected_word_tv)
            showBottomSheetBTN.setOnClickListener {
                bottomSheet.show(requireActivity().supportFragmentManager, "words")
            }
            selectedWordTV.text = "Select a Word"

            bottomSheet.selectedWord.observe(viewLifecycleOwner, Observer{
                selectedWordTV.text = it
            })
        }
    }

}