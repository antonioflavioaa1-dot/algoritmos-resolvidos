// Algoritmo 81
// Enunciado: Calcular o dígito verificador de uma conta com três algarismos.

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
    val conta = lerInt("Digite o número da conta com três algarismos: ")
    val numero = kotlin.math.abs(conta) % 1000
    val invertido = (numero % 10) * 100 + ((numero / 10) % 10) * 10 + numero / 100
    val soma = (numero + invertido) % 1000
    val d1 = (soma / 100) * 1
    val d2 = ((soma / 10) % 10) * 2
    val d3 = (soma % 10) * 3
    println("Dígito verificador: ${(d1 + d2 + d3) % 10}")
}
