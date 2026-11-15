// Algoritmo 110
// Enunciado: Ler dois números e informar se são iguais ou diferentes.

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
    if (a == b) println("Iguais") else println("Diferentes")
}
