// Algoritmo 47
// Enunciado: Ler um número de três algarismos e imprimir seus algarismos invertidos.

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
    val n = kotlin.math.abs(numero)
    val centena = n / 100
    val dezena = (n / 10) % 10
    val unidade = n % 10
    val invertido = unidade * 100 + dezena * 10 + centena
    println("Número: $numero")
    println("Invertido: $invertido")
}
