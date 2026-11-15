// Algoritmo 58
// Enunciado: Calcular a expressão de x usando três valores informados.

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
    val xnum1 = lerDouble("Digite o primeiro valor: ")
    val xnum2 = lerDouble("Digite o segundo valor: ")
    val xnum3 = lerDouble("Digite o terceiro valor: ")
    val denominador = xnum3 + xnum1
    if (denominador != 0.0) {
        val x = xnum1 + xnum2 / denominador + 2 * (xnum1 - xnum2) + ln(64.0) / ln(2.0)
        println("X = $x")
    } else println("Não é possível dividir por zero.")
}
