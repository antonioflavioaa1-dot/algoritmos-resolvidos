// Algoritmo 86
// Enunciado: Classificar um número como positivo, negativo ou nulo.

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
    val numero = lerDouble("Digite um número: ")
    when {
        numero > 0 -> println("POSITIVO")
        numero < 0 -> println("NEGATIVO")
        else -> println("NULO")
    }
}
