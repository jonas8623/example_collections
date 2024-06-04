package com.example.aulacolecoes.teste

class Driver(val name: String) {
    fun displayName() = println("Motorista: $name")

    class Truk(val nameTruck: String) { // Nested class - classe aninhada
        fun displayNameTruck() = println("Caminhão: $nameTruck")
    }
}

data class Question(val question: String, val answer: Any)

// Getter(conseguir, recuperar) Setter(configurar)
class User {
    var name: String = ""
        get() {
            return field.uppercase()
        }
        set(value) {
            field = "SET VALUE: $value"
        }
    var age: Int = 0
    val isOlder get() = age >= 18

    fun savePhone(vararg phones: String) { // varargs parametro de lista
        for (phone in phones) {
            println("TELEFONE: $phone")
        }
    }
}

fun main() {
//    val driver = Driver("Jonas")
//    driver.displayName()

    val truck = Driver.Truk("Jonas")
    truck.displayNameTruck()

    val question1 = Question("Pergunta 1", "Resposta AA")
    val question2 = Question("Pergunta 1", 2)

    // Destructuring - Pegar dados de um data class
    val (question, answer) = question2
    println(question)
    println(answer)

    val user = User()
    user.name = "beto"
    user.age = 25
    println("Usuário: nome - ${user.name} - idade: ${user.age} - maior de idade - ${user.isOlder}")
    user.savePhone("(51) 9956-9658", "(51) 9956-95623", "(51) 9956-96520")
}