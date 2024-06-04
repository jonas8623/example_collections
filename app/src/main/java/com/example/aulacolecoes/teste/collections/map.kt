package com.example.aulacolecoes.teste.collections

data class Product(val name: String, val value: Double?)

fun main() {
    // 0 -> "Jonas"
//    val listNames = mapOf(0 to "Jonas", 1 to "Beto", 2 to "Jonas")
//    listNames.forEach { t, u ->  println("Key: $t Value: $u" ) }

    val listProducts = mutableMapOf(
        0 to Product("Mouse", null),
        1 to Product("Phone", 2500.00)
    )
    println(listProducts[1])
    listProducts.put(4, Product("glass", 50.0))
    listProducts[3] = Product("Keyboard", 30.0)
    listProducts.remove(0)
    listProducts.forEach { product ->
        println("Key: ${product.key} Value: ${product.value}")
    }
}