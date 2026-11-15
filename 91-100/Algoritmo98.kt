// Algoritmo 98
// Enunciado: Verificar se uma prestação não ultrapassa 30% do salário bruto.

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
    val salarioBruto = lerDouble("Digite o salário bruto: ")
    val prestacao = lerDouble("Digite o valor da prestação: ")
    if (prestacao <= salarioBruto * 0.30) println("Empréstimo concedido")
    else println("Empréstimo negado")
}
