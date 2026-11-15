// Algoritmo 51
// Enunciado: Calcular perímetro e área de um círculo.

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
    val raio = lerDouble("Digite o raio: ")
    println("Perímetro: ${2 * PI * raio}")
    println("Área: ${PI * raio.pow(2)}")
}
