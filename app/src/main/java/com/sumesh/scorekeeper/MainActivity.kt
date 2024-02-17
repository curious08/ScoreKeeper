package com.sumesh.scorekeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textview:TextView
    var count =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textview = findViewById(R.id.tvresult)
    }

    fun incrementCounter(view: View) {

        count++
        textview.setText(count.toString())

    }
    fun decrementCounter(view: View) {
        count--
        textview.setText(count.toString())

    }
}