// Algoritmo 23
// Enunciado: Ler um número inteiro de três algarismos e mostrar o algarismo das dezenas.

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
    val numero = lerInt("Digite um número de três algarismos: ")
    val dezenas = (kotlin.math.abs(numero) / 10) % 10
    println("Algarismo das dezenas: $dezenas")
}
