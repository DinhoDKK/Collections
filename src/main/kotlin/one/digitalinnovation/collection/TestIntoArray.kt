package one.digitalinnovation.collection

fun main() {
    val value = IntArray(5)

    value[0] = 1
    value[1] = 7
    value[2] = 6
    value[3] = 3
    value[4] = 2

    for(valor in value){
        println(valor)
    }
    println("_______________________")
    value.forEach { valor ->
        println(valor)
    }
    println("_______________________")
    for(index in value.indices){
        println(value[index])
    }
    println("_______________________")
    value.sort()
    for(valor in value){
        println(valor)
    }

}