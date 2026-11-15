// Algoritmo 74
// Enunciado: Calcular quantos salários mínimos uma pessoa recebe.

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
    val salarioMinimo = lerDouble("Digite o salário mínimo: ")
    val salarioPessoa = lerDouble("Digite o salário da pessoa: ")
    if (salarioMinimo > 0) println("Quantidade de salários mínimos: ${salarioPessoa / salarioMinimo}")
    else println("O salário mínimo deve ser maior que zero.")
}
