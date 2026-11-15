// Algoritmo 96
// Enunciado: Informar se um número é divisível por 3 e por 7.

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
    val numero = lerInt("Digite um número: ")
    if (numero % 3 == 0 && numero % 7 == 0) println("É divisível por 3 e por 7")
    else println("Não é divisível por 3 e por 7")
}
