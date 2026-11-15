// Algoritmo 92
// Enunciado: Somar dois números; se a soma passar de 20, acrescentar 8; caso contrário, subtrair 5.

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
    val soma = a + b
    val resultado = if (soma > 20) soma + 8 else soma - 5
    println("Resultado: $resultado")
}
