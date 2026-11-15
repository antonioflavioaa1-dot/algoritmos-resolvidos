// Algoritmo 89
// Enunciado: Calcular o peso de uma pessoa em outro planeta pela gravidade relativa.

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
    println("1-Mercúrio  2-Vênus  3-Marte  4-Júpiter  5-Saturno  6-Urano")
    val planeta = lerInt("Escolha o planeta (1 a 6): ")
    val pesoTerra = lerDouble("Digite seu peso na Terra: ")
    val gravidade = when (planeta) {
        1 -> 0.37
        2 -> 0.88
        3 -> 0.38
        4 -> 2.64
        5 -> 1.15
        6 -> 1.17
        else -> 0.0
    }
    if (gravidade > 0) println("Peso no planeta escolhido: ${pesoTerra / 10 * gravidade}")
    else println("Planeta inválido.")
}
