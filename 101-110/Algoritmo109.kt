// Algoritmo 109
// Enunciado: Ler dois nomes e imprimi-los em ordem alfabética.

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
    val nome1 = lerTexto("Digite o primeiro nome: ")
    val nome2 = lerTexto("Digite o segundo nome: ")
    if (nome1.compareTo(nome2, ignoreCase = true) <= 0) println("$nome1 $nome2")
    else println("$nome2 $nome1")
}
