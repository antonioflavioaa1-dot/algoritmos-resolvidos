// Algoritmo 101
// Enunciado: Verificar se um número está entre 20 e 90, sem incluir os limites.

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
    val numero = lerDouble("Digite um número: ")
    if (numero > 20 && numero < 90) println("Está na faixa de 20 a 90, exclusive")
    else println("Está fora da faixa de 20 a 90")
}
