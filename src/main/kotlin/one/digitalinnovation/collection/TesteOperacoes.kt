package one.digitalinnovation.collection

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }
    println("--------------------")
    println("O maior salario é: ${salarios.max()}")
    println("O menor salario é: ${salarios.min()}")
    println("A media dos salarios é: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    println("--------------------")
    salariosMaiorQue2500.forEach { println(it)}

}