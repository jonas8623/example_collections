package com.example.aulacolecoes.teste.collections.metodos

fun main() {
    val snacks1 = listOf("Hamburguer", "Pastel", "Cachorro quente")
    val snacks2 = listOf("Sanduiche", "Bolo de Cenoura", "Bolacha")
    val newSnacks = snacks1.union(snacks2)
    println(newSnacks)
}