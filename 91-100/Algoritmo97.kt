// Algoritmo 97
// Enunciado: Verificar se um número é múltiplo de 10, 2, 5 ou de nenhum deles.

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
    when {
        numero % 10 == 0 -> println("Múltiplo de 10")
        numero % 2 == 0 -> println("Múltiplo de 2")
        numero % 5 == 0 -> println("Múltiplo de 5")
        else -> println("Não é múltiplo de 2 nem de 5")
    }
}
