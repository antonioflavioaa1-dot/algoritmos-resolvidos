// Algoritmo 26
// Enunciado: Converter uma data do formato DDMMAA para MMDDAA.

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
    println("Data no formato MMDDAA: %02d%02d%02d".format(mes, dia, ano))
}
