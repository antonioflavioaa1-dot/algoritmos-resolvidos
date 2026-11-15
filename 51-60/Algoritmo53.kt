// Algoritmo 53
// Enunciado: Calcular a diagonal de um paralelepípedo a partir de seus três lados.

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
    val a = lerDouble("Digite a base: ")
    val b = lerDouble("Digite a altura: ")
    val c = lerDouble("Digite a profundidade: ")
    println("Diagonal: ${sqrt(a.pow(2) + b.pow(2) + c.pow(2))}")
}
