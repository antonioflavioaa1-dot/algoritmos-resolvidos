// Algoritmo 57
// Enunciado: Ler duas notas e mostrar a média truncada e arredondada.

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
    val pr1 = lerDouble("Digite a nota PR1: ")
    val pr2 = lerDouble("Digite a nota PR2: ")
    val media = (pr1 + pr2) / 2
    println("Média truncada: ${media.toInt()}")
    println("Média arredondada: ${media.roundToInt()}")
}
