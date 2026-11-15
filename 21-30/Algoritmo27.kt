// Algoritmo 27
// Enunciado: Demonstrar incremento e decremento de variáveis.

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
    var x = 2
    var y = 5
    println("X = $x")
    x++
    println("Y = $y")
    y--
    println("Novo valor de X = $x")
    println("Novo valor de Y = $y")
}
