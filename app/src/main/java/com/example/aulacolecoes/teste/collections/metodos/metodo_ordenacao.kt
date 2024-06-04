package com.example.aulacolecoes.teste.collections.metodos

fun main() {

//    val numbers = listOf(1, 4, 3, 2, 8, 7)
//    println(numbers.sorted()) // ASC a-z

    val numbers = listOf(5, 3, 1, 2, 8, 7, 9)
    val newList = numbers.sortedDescending() // DESC z-a
    println(newList)

}