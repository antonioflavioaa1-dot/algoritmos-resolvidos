// Algoritmo 83
// Enunciado: Se o número for positivo, mostrar seu inverso; caso contrário, seu valor absoluto.

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
    val numero = lerDouble("Digite um número: ")
    if (numero > 0) println("Inverso: ${1 / numero}")
    else println("Valor absoluto: ${abs(numero)}")
}
