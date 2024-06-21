package com.example.aulacolecoes.teste

class ComponenteListagem {
    var adaptador: Adaptador? = null
    fun executar() {
        if (adaptador != null) {
            val quantidadeItens = adaptador!!.quantidadeItens()
            for (posicao in 0 until quantidadeItens) {
                val item = adaptador!!.montarLayoutParaItens(posicao = posicao)
                println(item)
            }
        } else {
            println("Erro ao carregar o adaptador")
        }
    }
}

interface Adaptador {

    fun quantidadeItens(): Int
    fun montarLayoutParaItens(posicao: Int): String
}

class MeuAdaptador(lista: List<String>) : Adaptador {

    private val listaItens = lista

    override fun quantidadeItens(): Int = listaItens.size

    override fun montarLayoutParaItens(posicao: Int): String {
        val nome = listaItens[posicao]
        return "$posicao) nome $nome -"
    }
}

fun main() {
    val listaNomes = listOf("Jonas", "Carlos", "Souza", "Beto")
    val componenteListagem = ComponenteListagem()
    val meuAdaptador = MeuAdaptador(lista = listaNomes)
    componenteListagem.adaptador = meuAdaptador
    componenteListagem.executar()
}