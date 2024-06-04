package com.example.aulacolecoes.teste

fun main() {

    var list = intArrayOf(10, 25, 20, 30)
    list = list.plus(50)
    println("INDEX: ${list[0]}")
    println("LENGTH: ${list.size}")
    println("first element: ${list.first()}")
    println("last element: ${list.last()}")
//    list.shuffle() // Embaralhar elementos
    list.forEach { item ->
        println(item)
    }

}