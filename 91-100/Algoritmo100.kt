// Algoritmo 100
// Enunciado: Verificar se os algarismos de milhar e centena formam um número múltiplo de 4.

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
    val numero = kotlin.math.abs(lerInt("Digite um número de quatro algarismos: "))
    val doisPrimeiros = numero / 100
    if (doisPrimeiros % 4 == 0) println("$doisPrimeiros é múltiplo de 4")
    else println("$doisPrimeiros não é múltiplo de 4")
}
