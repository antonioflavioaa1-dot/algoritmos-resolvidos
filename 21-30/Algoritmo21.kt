// Algoritmo 21
// Enunciado: Demonstrar a hierarquia de operadores aritméticos em Kotlin.

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
    println("12 + 5 / 2 = ${12 + 5.0 / 2}")
    println("(12 + 5) / 2 = ${(12 + 5) / 2.0}")
    println("64 elevado a 1/4 = ${64.0.pow(1.0 / 4.0)}")
    println("3 * 7 % 5 = ${3 * 7 % 5}")
    println("(3 * 7) % 5 = ${(3 * 7) % 5}")
    println("3 * 7 / 5 = ${3 * 7 / 5}")
}
