// Algoritmo 54
// Enunciado: Calcular a área de um triângulo pela base e altura.

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
    val base = lerDouble("Digite a base: ")
    val altura = lerDouble("Digite a altura: ")
    println("Área do triângulo: ${base * altura / 2}")
}
