// Algoritmo 42
// Enunciado: Ler um ângulo em graus e mostrar seno, cosseno, tangente, secante, cossecante e cotangente.

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
    val graus = lerDouble("Digite o ângulo em graus: ")
    val radianos = Math.toRadians(graus)
    val seno = sin(radianos)
    val cosseno = cos(radianos)
    val tangente = tan(radianos)
    println("Seno: $seno")
    println("Cosseno: $cosseno")
    println("Tangente: $tangente")
    println("Secante: ${if (abs(cosseno) > 1e-10) 1 / cosseno else "indefinida"}")
    println("Cossecante: ${if (abs(seno) > 1e-10) 1 / seno else "indefinida"}")
    println("Cotangente: ${if (abs(tangente) > 1e-10) 1 / tangente else "indefinida"}")
}
