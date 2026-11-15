// Algoritmo 41
// Enunciado: Ler quatro números e calcular a média ponderada com pesos 1, 2, 3 e 4.

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
    val a = lerDouble("Digite o primeiro número: ")
    val b = lerDouble("Digite o segundo número: ")
    val c = lerDouble("Digite o terceiro número: ")
    val d = lerDouble("Digite o quarto número: ")
    val media = (a * 1 + b * 2 + c * 3 + d * 4) / 10
    println("Média ponderada: $media")
}
