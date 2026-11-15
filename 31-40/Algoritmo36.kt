// Algoritmo 36
// Enunciado: Ler dois números inteiros e imprimir a soma.

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
    val a = lerInt("Digite o primeiro número: ")
    val b = lerInt("Digite o segundo número: ")
    println("Soma: ${a + b}")
}
