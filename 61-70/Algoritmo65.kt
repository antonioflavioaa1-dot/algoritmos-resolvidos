// Algoritmo 65
// Enunciado: Calcular o volume de uma lata cilíndrica de óleo.

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
    val altura = lerDouble("Digite a altura da lata: ")
    val raio = lerDouble("Digite o raio da lata: ")
    println("Volume: ${PI * raio.pow(2) * altura}")
}
