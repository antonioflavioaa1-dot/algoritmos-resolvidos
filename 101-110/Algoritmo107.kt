// Algoritmo 107
// Enunciado: Imprimir o nome somente se o prenome for José.

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
    val nome = lerTexto("Digite o nome completo: ")
    val prenome = nome.trim().substringBefore(' ')
    if (prenome.equals("JOSÉ", ignoreCase = true)) println(nome)
}
