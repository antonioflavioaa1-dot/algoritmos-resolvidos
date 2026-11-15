// Algoritmo 60
// Enunciado: Calcular o décimo termo de uma progressão aritmética.

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
    val primeiroTermo = lerDouble("Digite o primeiro termo: ")
    val razao = lerDouble("Digite a razão: ")
    println("Décimo termo: ${primeiroTermo + 9 * razao}")
}
