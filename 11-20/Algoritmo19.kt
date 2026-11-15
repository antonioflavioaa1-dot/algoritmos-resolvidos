// Algoritmo 19
// Enunciado: Demonstrar funções matemáticas, potência, raiz, seno e conversões.

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
    println("Raiz de 64: ${sqrt(64.0)}")
    println("Seno de 45 graus: ${sin(45.0 * PI / 180)}")
    println("Potência 8 elevado a 3: ${8.0.pow(3)}")
    println("Raiz cúbica de 8: ${8.0.pow(1.0 / 3.0)}")
    println("Absoluto de -8: ${abs(-8)}")
    println("5.5 arredondado: ${5.5.roundToInt()}")
    println("6.5 arredondado: ${6.5.roundToInt()}")
    println("87 convertido para real: ${87.toDouble()}")
}
