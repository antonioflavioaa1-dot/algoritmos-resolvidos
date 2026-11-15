// Algoritmo 45
// Enunciado: Ler um número e mostrar seu quadrado e sua raiz quadrada.

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
    println("Número: $numero")
    println("Quadrado: ${numero.pow(2)}")
    if (numero >= 0) println("Raiz quadrada: ${sqrt(numero)}")
    else println("A raiz quadrada real não está definida para esse número.")
}
