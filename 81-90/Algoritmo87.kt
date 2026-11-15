// Algoritmo 87
// Enunciado: Perguntar a capital do Brasil e avaliar a resposta.

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
    val resposta = lerTexto("Qual é a capital do Brasil? ")
    if (resposta.equals("Brasília", ignoreCase = true)) println("PARABÉNS!")
    else println("ERRADO! ESTUDE MAIS!")
}
