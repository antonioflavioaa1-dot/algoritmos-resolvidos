// Algoritmo 105
// Enunciado: Classificar a pessoa pela sigla do estado: RJ, SP, MG ou outros.

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
    val sigla = lerTexto("Digite a sigla do estado: ").uppercase()
    when (sigla) {
        "RJ" -> println("Carioca")
        "SP" -> println("Paulista")
        "MG" -> println("Mineiro")
        else -> println("Outros estados")
    }
}
