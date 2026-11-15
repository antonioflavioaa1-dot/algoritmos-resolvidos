// Algoritmo 120
// Enunciado: Ler três números e armazená-los como maior, intermediário e menor.

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
    val entrada = listOf(
        lerDouble("Digite o primeiro número: "),
        lerDouble("Digite o segundo número: "),
        lerDouble("Digite o terceiro número: ")
    ).sorted()
    val menor = entrada[0]
    val intermediaria = entrada[1]
    val maior = entrada[2]
    println("Maior: $maior")
    println("Intermediário: $intermediaria")
    println("Menor: $menor")
}
