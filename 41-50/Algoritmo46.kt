// Algoritmo 46
// Enunciado: Calcular o novo saldo de uma aplicação com reajuste de 1%.

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
    val saldo = lerDouble("Digite o saldo da aplicação: ")
    println("Novo saldo: ${saldo * 1.01}")
}
