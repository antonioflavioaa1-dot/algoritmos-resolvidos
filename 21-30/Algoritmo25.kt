// Algoritmo 25
// Enunciado: Ler uma data no formato DDMMAA e separar dia, mês e ano.

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
    val data = lerInt("Digite a data no formato DDMMAA: ")
    val dia = data / 10000
    val mes = (data % 10000) / 100
    val ano = data % 100
    println("Dia: $dia")
    println("Mês: $mes")
    println("Ano: $ano")
}
