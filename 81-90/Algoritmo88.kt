// Algoritmo 88
// Enunciado: Criar uma calculadora simples com soma, subtração, multiplicação e divisão.

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
    val opcao = lerTexto("Digite a operação (+, -, *, /): ")
    val a = lerDouble("Digite o primeiro número: ")
    val b = lerDouble("Digite o segundo número: ")
    when (opcao) {
        "+" -> println("Soma: ${a + b}")
        "-" -> println("Subtração: ${a - b}")
        "*" -> println("Multiplicação: ${a * b}")
        "/" -> if (b != 0.0) println("Divisão: ${a / b}") else println("Não é possível dividir por zero.")
        else -> println("Opção não disponível!")
    }
}
