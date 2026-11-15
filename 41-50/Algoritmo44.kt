// Algoritmo 44
// Enunciado: Ler um número e uma base e calcular o logaritmo nessa base.

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
    val numero = lerDouble("Digite o logaritmando: ")
    val base = lerDouble("Digite a base: ")
    if (numero > 0 && base > 0 && base != 1.0) {
        println("Logaritmo de $numero na base $base: ${ln(numero) / ln(base)}")
    } else println("Use número positivo e base positiva diferente de 1.")
}
