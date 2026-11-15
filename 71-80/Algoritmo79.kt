// Algoritmo 79
// Enunciado: Calcular o valor acumulado de depósitos mensais com juros.

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
    val aplicacao = lerDouble("Digite o valor da aplicação mensal: ")
    val taxa = lerDouble("Digite a taxa em decimal (ex.: 0.05): ")
    val meses = lerInt("Digite a quantidade de meses: ")
    val acumulado = if (taxa == 0.0) aplicacao * meses
                    else aplicacao * ((1 + taxa).pow(meses) - 1) / taxa
    println("Valor acumulado: $acumulado")
}
