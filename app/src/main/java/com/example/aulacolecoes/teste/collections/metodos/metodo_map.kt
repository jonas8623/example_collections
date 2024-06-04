package com.example.aulacolecoes.teste.collections.metodos

fun main() {

    val names = listOf("Jonas", "Carlos", "Souza")
    val newNameList = names.map { name -> println(name.uppercase())  }
//    println(newNameList)

}