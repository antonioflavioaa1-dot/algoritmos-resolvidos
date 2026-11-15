// Algoritmo 52
// Enunciado: Calcular perímetro, área e diagonal de um quadrado.

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
    val lado = lerDouble("Digite o lado do quadrado: ")
    println("Perímetro: ${4 * lado}")
    println("Área: ${lado.pow(2)}")
    println("Diagonal: ${lado * sqrt(2.0)}")
}
