package com.example.aulacolecoes.teste.collections

fun main() {
    val listNames = mutableListOf("Jonas", "Carlos", "Beto")
    listNames.add("Souza")
    listNames.forEach {item ->
        println(item)
    }
}