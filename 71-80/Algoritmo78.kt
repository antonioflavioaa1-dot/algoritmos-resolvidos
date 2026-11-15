// Algoritmo 78
// Enunciado: Calcular a quantidade de diagonais de um polígono convexo.

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
    val lados = lerInt("Digite a quantidade de lados do polígono: ")
    if (lados >= 3) println("Quantidade de diagonais: ${lados * (lados - 3) / 2}")
    else println("Um polígono precisa ter pelo menos 3 lados.")
}
