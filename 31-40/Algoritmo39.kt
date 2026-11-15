// Algoritmo 39
// Enunciado: Ler duas notas e imprimir a média aritmética.

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
    val nota1 = lerDouble("Digite a primeira nota: ")
    val nota2 = lerDouble("Digite a segunda nota: ")
    println("Média: ${(nota1 + nota2) / 2}")
}
