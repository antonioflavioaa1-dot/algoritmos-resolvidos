// Algoritmo 40
// Enunciado: Ler dividendo e divisor e mostrar quociente e resto.

import kotlin.math.*

private fun lerInt(mensagem: String): Int {
    print(mensagem)
    return readLine()?.trim()?.toIntOrNull() ?: 0
}

private fun lerDouble(mensagem: String): Double {
    print(mensagem)
    val entrada = readLine()?.trim()?.replace(',', '.')
    return entrada?.toDoubleOrNull() ?: 0.0
}

private fun lerTexto(mensagem: String): String {
    print(mensagem)
    return readLine()?.trim().orEmpty()
}

fun main() {
    val dividendo = lerInt("Digite o dividendo: ")
    val divisor = lerInt("Digite o divisor: ")
    if (divisor == 0) {
        println("Não é possível dividir por zero.")
    } else {
        println("Dividendo: $dividendo")
        println("Divisor: $divisor")
        println("Quociente: ${dividendo / divisor}")
        println("Resto: ${dividendo % divisor}")
    }
}
