// Algoritmo 48
// Enunciado: Calcular preço por quilowatt, valor da conta e valor com desconto de 10%.

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
    val consumo = lerDouble("Digite o consumo em quilowatts: ")
    val precoKw = salarioMinimo / 700
    val valor = precoKw * consumo
    println("Preço por quilowatt: R$ $precoKw")
    println("Valor a pagar: R$ $valor")
    println("Valor com desconto de 10%: R$ ${valor * 0.90}")
}
