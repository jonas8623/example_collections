package com.example.aulacolecoes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textViewResult: TextView
    private lateinit var buttonSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initActivity()

    }

    private fun initActivity() {
        textViewResult = findViewById(R.id.textViewResult)
        buttonSend = findViewById(R.id.buttonSend)

        buttonSend.setOnClickListener {  }
    }
}