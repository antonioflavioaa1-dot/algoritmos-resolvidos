// Algoritmo 119
// Enunciado: Ler três números e imprimi-los em ordem decrescente.

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
    val numeros = listOf(
        lerDouble("Digite o primeiro número: "),
        lerDouble("Digite o segundo número: "),
        lerDouble("Digite o terceiro número: ")
    ).sortedDescending()
    println("Ordem decrescente: ${numeros.joinToString(" ")}")
}
