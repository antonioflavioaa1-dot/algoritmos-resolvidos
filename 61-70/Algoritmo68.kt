// Algoritmo 68
// Enunciado: Trocar os valores de duas variáveis e mostrá-los.

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
    var a = lerDouble("Digite o primeiro número: ")
    var b = lerDouble("Digite o segundo número: ")
    val auxiliar = a
    a = b
    b = auxiliar
    println("A = $a")
    println("B = $b")
}
