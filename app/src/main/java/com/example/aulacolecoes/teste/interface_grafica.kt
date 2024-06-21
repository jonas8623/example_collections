package com.example.aulacolecoes.teste

class Musico(val instrumento: Instrumento) {
    fun tocar() {
        println("Musico tocando")
        instrumento.sendoTocado()
    }
}

interface Instrumento {
    fun sendoTocado()
}

class Violao : Instrumento {
    override fun sendoTocado() = println("utilizar cordas")
}

class Bateria : Instrumento {
    override fun sendoTocado() = println("utilizar baquetas")
}

fun main() {
    val violao = Violao()
    val musico = Musico(violao)
    musico.tocar()

    val bateria = Bateria()
    val musico2 = Musico(bateria)
    musico2.tocar()
}