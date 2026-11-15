// Algoritmo 50
// Enunciado: Calcular perímetro, área e diagonal de um retângulo.

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
    val base = lerDouble("Digite a base: ")
    val altura = lerDouble("Digite a altura: ")
    val perimetro = 2 * (base + altura)
    val area = base * altura
    val diagonal = sqrt(base.pow(2) + altura.pow(2))
    println("Perímetro: $perimetro")
    println("Área: $area")
    println("Diagonal: $diagonal")
}
