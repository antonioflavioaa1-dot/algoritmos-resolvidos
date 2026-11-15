// Algoritmo 63
// Enunciado: Calcular o salário líquido de um professor com desconto do INSS.

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
    val aulas = lerInt("Digite a quantidade de aulas no mês: ")
    val valorHora = lerDouble("Digite o valor da hora-aula: ")
    val percentual = lerDouble("Digite o percentual de desconto: ")
    val salarioBruto = aulas * valorHora
    val desconto = salarioBruto * percentual / 100
    println("Salário líquido: ${salarioBruto - desconto}")
}
