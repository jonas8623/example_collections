package com.example.aulacolecoes.teste.collections

data class Car(val name: String, val model: String)

fun main() {

//    val listNames = setOf("João", "Maria", "Ingrid", "Ingrid")
//    val newListNames = listNames.plus("Jorge")
//    listNames.forEach { name ->
//        println(name)
//    }

    val listNames = mutableSetOf("Carlos", "Beto", "Ana", "Carlos")
    listNames.add("Mariana")
    listNames.remove("Carlos")
    listNames.forEach { name ->
        println(name)
    }

    val listCars = mutableListOf(
        Car("Fluence", "Renault"),
        Car("Gol", "Volksvagen"),
    )
    listCars.add(Car("Logan", "Renault"))
    listCars.forEach { car -> println(car.name) }

}