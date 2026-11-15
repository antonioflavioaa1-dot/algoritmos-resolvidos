// Algoritmo 75
// Enunciado: Converter o peso inteiro de uma pessoa para gramas e calcular aumento de 12%.

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
    val pesoKg = lerInt("Digite o peso em kg (parte inteira): ")
    val pesoGramas = pesoKg * 1000
    println("Peso em gramas: $pesoGramas")
    println("Peso após aumento de 12%: ${pesoGramas * 1.12}")
}
