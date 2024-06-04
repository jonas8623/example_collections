package com.example.aulacolecoes.teste

class Math {
    fun sun(value1: Int, value2: Int): Int = value1 + value2 // Método
}

// Função
//fun sun(value1: Int, value2: Int) : Int = value1 + value2

fun calculate(function: (Int, Int) -> Int) {
    val result = function(10, 10)
    println(result)
}

class Button2 {
    fun setOnClickLambda(function: () -> Unit) {
        function()
    }
}

fun main() {
//    calculate(::sun)
    val math = Math()
    calculate(math::sun)

    val functionLambda = { name: String, age: Int ->
        println("My name is: $name and age: $age")
    }
    functionLambda("Jonas", 27)

    val button = Button2()
    button.setOnClickLambda {
        println("Executing function lambda")
    }
}