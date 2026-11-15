// Algoritmo 61
// Enunciado: Calcular o quinto termo de uma progressão geométrica.

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
    println("Quinto termo: ${primeiroTermo * razao.pow(4)}")
}
