package com.example.aulacolecoes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var mensagemAdapter: MensagemAdapter
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val list = mutableListOf(
            Mensagem("Jonas", "Olá, tudo bem?", "10:30"),
            Mensagem(
                "Beto",
                "Olá, tudo bem?, Como você está?. Podemos verificar amanhã o aplicativo interno da empresa com o pessoal da fábrica. Você vem hoje para a nossa reunião?",
                "11:50"
            ),
            Mensagem("Jackson", "Bom dia Pessoal", "09:45"),
            Mensagem("Vera", "Olá, tudo bem?, você vem hoje para a nossa reunião?", "09:45"),
            Mensagem(
                "Cesar",
                "Podemos verificar amanhã o aplicativo interno da empresa com o pessoal da fábrica",
                "09:45"
            ),
        )

        recyclerView = findViewById(R.id.recycler_view)
        button = findViewById(R.id.addItemButton)
        mensagemAdapter = MensagemAdapter {
            Toast.makeText(this, "Olá $it", Toast.LENGTH_LONG).show()
            startActivity(Intent(this, ListViewActivity::class.java))
        }
        recyclerView.adapter = mensagemAdapter
        mensagemAdapter.updateList(list = list)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.addItemDecoration(
            DividerItemDecoration(
                this,
                RecyclerView.VERTICAL
            )
        )
        button.setOnClickListener {
            mensagemAdapter.updateListByIndex()
//            list.add(
//                Mensagem(
//                    "Douglas",
//                    "Podemos verificar amanhã!",
//                    "11:45"
//                ),
//            )
//            mensagemAdapter.updateList(list = list)
        }
    }
}