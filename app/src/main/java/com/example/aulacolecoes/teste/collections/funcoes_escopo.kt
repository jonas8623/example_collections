package com.example.aulacolecoes.teste.collections

/*
  Let -> Comumente utilizado para validações de Null, permite alterar um objeto e caso necessário
  retorne o objeto alterado

  Run -> Útil para inicializar um objeto e realizar algumas operações

  With -> Parecido com o Run, é usado para alterar propriedades de um objeto, mas tem uma
  sintaxe diferente

  Apply -> Comumnete utilizado para aplicar configurações em objetos

  Also -> Quando você ver "also" no código, você pode ler "e também faça isso com o objeto",
   comumente utilizado para executar ações sem modificar o objeto
 */

data class Product2(var name: String, var price: Double) {

    fun disable() = println("Esse produto foi desativado: $this ")

    override fun toString(): String {
        return "Product2(name='$name', price=$price)"
    }
}

class AlertDialogModel {

    fun displayTitle(title: String) = println(title)
    fun displayDescription(description: String) = println(description)
    fun settingCancel() = println("Ação de cancelar")
    fun settingConfirm() = println("Ação de confirmar")

}

fun saveProduct(product: Product2) {}

fun main() {
    val product: Product2?
    product = Product2("Celular", 3000.00)

    product?.let { item ->
        item.price = 1300.00
        saveProduct(item)
    }

    product?.run {
        disable()
    }

    with(product) {
        toString()
    }

    println(product?.name)
    println(product?.price)

    val alertDialogModel = AlertDialogModel()
//    alertDialogModel.displayTitle("Dialog")
//    alertDialogModel.displayDescription("Aparecendo dialog na tela")
//    alertDialogModel.settingCancel()
//    alertDialogModel.settingConfirm()

    alertDialogModel.apply {
        displayTitle("Dialog")
        displayDescription("Aparecendo dialog na tela")
        settingCancel()
        settingConfirm()
    }

    val listNames = listOf("Carlos", "Beto", "Rodrigo")
    listNames.map { item -> item.uppercase() }.also { println(it) }
}