// Algoritmo 33
// Enunciado: Ler dois números inteiros e imprimi-los.

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
    val numero1 = lerInt("Digite o primeiro número: ")
    val numero2 = lerInt("Digite o segundo número: ")
    println("Número 1: $numero1")
    println("Número 2: $numero2")
}
