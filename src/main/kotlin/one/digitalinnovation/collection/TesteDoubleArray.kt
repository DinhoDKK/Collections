package one.digitalinnovation.collection

fun main() {
    val salario = DoubleArray (3)
    salario[0] = 1000.0
    salario[1] = 3000.0
    salario[2] = 500.0

    salario.forEach { println(it) }
    println("----------------")

    salario.forEachIndexed{ index, salarioi ->
     salario[index] = salarioi * 1.1
    }

    salario.forEach { println(it) }
    println("----------------")

    val salario2 = doubleArrayOf(1500.0, 1250.0, 5000.0)
    salario2.sort()

    salario2.forEach { println(it) }
}