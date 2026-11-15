// Algoritmo 102
// Enunciado: Informar se um número é maior, menor ou igual a 20.

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
        numero > 20 -> println("Maior que 20")
        numero < 20 -> println("Menor que 20")
        else -> println("Igual a 20")
    }
}
