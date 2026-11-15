// Algoritmo 22
// Enunciado: Demonstrar o uso de divisão inteira, divisão real e resto.

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
    println("20 / 4 / 2 = ${20 / 4 / 2}")
    println("20 / (4 * 2) = ${20.0 / (4 * 2)}")
    println("7 / 4 como divisão inteira = ${7 / 4}")
    println("7 / 4 como divisão real = ${7.0 / 4}")
    println("7 % 4 = ${7 % 4}")
    println("6 % 4 = ${6 % 4}")
}
