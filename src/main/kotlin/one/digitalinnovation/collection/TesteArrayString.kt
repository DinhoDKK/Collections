package one.digitalinnovation.collection

fun main() {
    val nomes = Array(3){""}
    nomes[0] = "Joao"
    nomes[1] = "Alex"
    nomes[2] = "Maria"

    for(nome in nomes){
        println(nome)
    }

    println("------------------")
    nomes.sort()
    nomes.forEach { println(it) }

    val nomes2 = arrayOf("Joao", "Alex", "Maria")

    println("------------------")
    nomes2.sort()
    nomes2.forEach { println(it) }
}
