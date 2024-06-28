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
            Mensagem("Beto", "Olá, tudo bem?, Como você está?. Podemos verificar amanhã o aplicativo interno da empresa com o pessoal da fábrica. Você vem hoje para a nossa reunião?", "11:50"),
            Mensagem("Jackson", "Bom dia Pessoal", "09:45"),
            Mensagem("Vera", "Olá, tudo bem?, você vem hoje para a nossa reunião?", "09:45"),
            Mensagem("Cesar", "Podemos verificar amanhã o aplicativo interno da empresa com o pessoal da fábrica", "09:45"),
        )

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = MensagemAdapter(list = list)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}