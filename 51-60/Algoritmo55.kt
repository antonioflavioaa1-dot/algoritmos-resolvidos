// Algoritmo 55
// Enunciado: Calcular a área de um losango pelas diagonais maior e menor.

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
    val diagonalMaior = lerDouble("Digite a diagonal maior: ")
    val diagonalMenor = lerDouble("Digite a diagonal menor: ")
    println("Área do losango: ${diagonalMaior * diagonalMenor / 2}")
}
