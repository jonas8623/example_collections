package com.example.aulacolecoes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val list = listOf(
            Mensagem("Jonas", "Olá, tudo bem?", "10:30"),
            Mensagem("Beto", "Olá, tudo bem?", "11:50"),
            Mensagem("André", "Olá, tudo bem?", "09:45"),
        )

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = MensagemAdapter(list = list)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}