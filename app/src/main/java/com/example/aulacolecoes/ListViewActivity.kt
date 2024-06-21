package com.example.aulacolecoes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListViewActivity : AppCompatActivity() {

    private lateinit var listaUsuarios: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view2)
        listaUsuarios = findViewById(R.id.listViewUsuarios)

        val usuarios = listOf("Jonas", "Alberto", "Carlos")
        listaUsuarios.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            usuarios
        )
    }
}