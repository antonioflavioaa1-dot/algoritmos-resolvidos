// Algoritmo 99
// Enunciado: Ler um número de três algarismos e verificar se a centena é par ou ímpar.

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
    val numero = kotlin.math.abs(lerInt("Digite um número de três algarismos: "))
    val centena = numero / 100
    if (centena % 2 == 0) println("A centena $centena é par")
    else println("A centena $centena é ímpar")
}
