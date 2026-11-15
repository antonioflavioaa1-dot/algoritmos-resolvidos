// Algoritmo 69
// Enunciado: Ler numerador e denominador e transformar a fração em decimal.

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
    val numerador = lerDouble("Digite o numerador: ")
    val denominador = lerDouble("Digite o denominador: ")
    if (denominador != 0.0) println("Número decimal: ${numerador / denominador}")
    else println("O denominador não pode ser zero.")
}
