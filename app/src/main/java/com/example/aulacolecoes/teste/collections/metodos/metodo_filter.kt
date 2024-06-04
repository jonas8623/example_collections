package com.example.aulacolecoes.teste.collections.metodos

fun main () {

    val listFruits = listOf("Maçã", "Laranja", "Melão")
    val newListFruits = listFruits.filter { fruit -> fruit == "Laranja" }
    println(newListFruits)

}