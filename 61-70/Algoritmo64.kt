// Algoritmo 64
// Enunciado: Converter uma temperatura de Celsius para Fahrenheit.

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
    val celsius = lerDouble("Digite a temperatura em Celsius: ")
    val fahrenheit = (9 * celsius + 160) / 5
    println("Temperatura em Fahrenheit: $fahrenheit")
}
