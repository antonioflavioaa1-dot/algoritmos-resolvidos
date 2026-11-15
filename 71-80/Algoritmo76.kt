// Algoritmo 76
// Enunciado: Mostrar o sucessor de um número entre 0 e 60 em ciclo.

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
    val numero = lerInt("Digite um número entre 0 e 60: ")
    if (numero in 0..60) println("Sucessor: ${(numero + 1) % 61}")
    else println("Número fora do intervalo permitido.")
}
