// Algoritmo 59
// Enunciado: Calcular a hipotenusa de um triângulo retângulo a partir dos catetos.

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
    val cateto1 = lerDouble("Digite o primeiro cateto: ")
    val cateto2 = lerDouble("Digite o segundo cateto: ")
    println("Hipotenusa: ${sqrt(cateto1.pow(2) + cateto2.pow(2))}")
}
