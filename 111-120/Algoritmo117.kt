// Algoritmo 117
// Enunciado: Ler três números, armazenar o maior na variável maior e mostrá-lo.

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
    val a = lerDouble("Digite o primeiro número: ")
    val b = lerDouble("Digite o segundo número: ")
    val c = lerDouble("Digite o terceiro número: ")
    var maior = a
    if (b > maior) maior = b
    if (c > maior) maior = c
    println("Maior: $maior")
}
