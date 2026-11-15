// Algoritmo 67
// Enunciado: Calcular o valor de uma prestação em atraso por taxa e tempo.

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
    val valor = lerDouble("Digite o valor da prestação: ")
    val taxa = lerDouble("Digite a taxa mensal em %: ")
    val tempo = lerDouble("Digite o atraso em meses: ")
    val prestacao = valor + valor * (taxa / 100) * tempo
    println("Prestação atualizada: $prestacao")
}
