// Algoritmo 115
// Enunciado: Mostrar o quadrado do menor número e a raiz do maior, quando possível.

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
    val x = lerDouble("Digite o valor de X: ")
    val y = lerDouble("Digite o valor de Y: ")
    if (x == y) {
        println("Os números são iguais.")
    } else {
        val menor = minOf(x, y)
        val maior = maxOf(x, y)
        println("Quadrado do menor: ${menor.pow(2)}")
        if (maior >= 0) println("Raiz do maior: ${sqrt(maior)}")
        else println("Não existe raiz quadrada real do maior número.")
    }
}
