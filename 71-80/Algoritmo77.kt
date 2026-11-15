// Algoritmo 77
// Enunciado: Calcular o quadrado da diferença e a diferença dos quadrados de dois números.

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
    val a = lerDouble("Digite o primeiro número: ")
    val b = lerDouble("Digite o segundo número: ")
    println("Quadrado da diferença: ${(a - b).pow(2)}")
    println("Diferença dos quadrados: ${a.pow(2) - b.pow(2)}")
}
