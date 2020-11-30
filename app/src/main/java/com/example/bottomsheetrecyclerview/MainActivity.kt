package com.example.bottomsheetrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    //val words = arrayListOf<String>("One", "Two", "Three")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val testRV = findViewById<RecyclerView>(R.id.test_rv)
//        val selectedWordTV = findViewById<TextView>(R.id.activity_word_tv)
//        val toggleBTN = findViewById<Button>(R.id.toggle_btn)
//        testRV.adapter = WordAdapter(words){selectedWord ->
//            selectedWordTV.text = selectedWord
//            testRV.visibility = View.GONE
//        }
//        testRV.layoutManager = LinearLayoutManager(this)
//
//        toggleBTN.setOnClickListener{
//            if(testRV.visibility == View.GONE){
//                testRV.visibility = View.VISIBLE
//            } else{
//                testRV.visibility = View.GONE
//            }
//        }
    }
}