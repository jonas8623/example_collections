package com.example.aulacolecoes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder


class MensagemAdapter(private val list: List<Mensagem>) :
    Adapter<MensagemAdapter.MensagemViewHolder>() {

    inner class MensagemViewHolder(view: View) : ViewHolder(view) {
        val textNome: TextView = view.findViewById(R.id.nameTextView)
        val textUltimaMensagem: TextView = view.findViewById(R.id.ultimaMensagemTextView)
//        val textHorario: TextView = view.findViewById(R.id.horarioTextView)
    }

    // Criar a visualização
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MensagemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.item_lista, parent, false)
        return MensagemViewHolder(view = itemView)
    }

    // vincular os dados com a view
    override fun onBindViewHolder(holder: MensagemViewHolder, position: Int) {
        val element = list[position]
        holder.textNome.text = element.nome
        holder.textUltimaMensagem.text = element.ultimaMensagem
//        holder.textHorario.text = element.horario
    }

    override fun getItemCount(): Int {
        return list.size
    }
}