package com.example.aulacolecoes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder


class MensagemAdapter(
    private val action: (String) -> Unit,
) :
    Adapter<MensagemAdapter.MensagemViewHolder>() {

    private var list = mutableListOf<Mensagem>()

    fun updateListByIndex() {
        this.list.removeAt(2)
        notifyItemRemoved(2)
//        this.list.add(2, Mensagem("Santos", "Almoçar fora?", "12:30"))
//        this.list.add(Mensagem("Santos 2", "Almoçar fora?", "12:30"))
//        this.list.add(Mensagem("Santos 3", "Almoçar fora?", "12:30"))
//        notifyItemRangeChanged(2, 3)
//        notifyItemInserted(2)
    }

    fun updateList(list: MutableList<Mensagem>) {
        this.list = list
        notifyDataSetChanged()
    }

    inner class MensagemViewHolder(view: View) : ViewHolder(view) {
//        val textNome: TextView = view.findViewById(R.id.nameTextView)
//        val textUltimaMensagem: TextView = view.findViewById(R.id.ultimaMensagemTextView)
//        val textHorario: TextView = view.findViewById(R.id.horarioTextView)

        val textNome: TextView = view.findViewById(R.id.nameCardTextView)
        val textUltimaMensagem: TextView = view.findViewById(R.id.descriptionCardTextView)
        val image: ImageView = view.findViewById(R.id.imageCardView)
        private val cardView: CardView = view.findViewById(R.id.cardView)

        fun bindView(mensagem: Mensagem) {
            textNome.text = mensagem.nome
            textUltimaMensagem.text = mensagem.ultimaMensagem

            cardView.setOnClickListener {
                action(mensagem.nome)
            }
        }
    }

    // Criar a visualização
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MensagemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
//        val itemView = layoutInflater.inflate(R.layout.item_lista, parent, false)
        val itemView = layoutInflater.inflate(R.layout.item_card_view, parent, false)
        return MensagemViewHolder(view = itemView)
    }

    // vincular os dados com a view
    override fun onBindViewHolder(holder: MensagemViewHolder, position: Int) {
        val element = list[position]

        holder.bindView(element)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}