// Algoritmo 70
// Enunciado: Calcular o total de uma conta de restaurante com gorjeta de 10%.

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
    val conta = lerDouble("Digite o valor da conta: ")
    val total = conta * 1.10
    println("Valor total com gorjeta: R$ ${"%.2f".format(total)}")
}
