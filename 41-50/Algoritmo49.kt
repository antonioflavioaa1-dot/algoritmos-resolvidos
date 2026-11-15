// Algoritmo 49
// Enunciado: Ler um nome e mostrar partes e caracteres da palavra.

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
    val nome = lerTexto("Digite um nome: ")
    println("Nome completo: $nome")
    println("Primeiro caractere: ${nome.firstOrNull() ?: ""}")
    println("Último caractere: ${nome.lastOrNull() ?: ""}")
    println("Do primeiro ao terceiro: ${nome.take(3)}")
    println("Quarto caractere: ${nome.getOrNull(3) ?: ""}")
    println("Todos menos o primeiro: ${nome.drop(1)}")
    println("Dois últimos: ${nome.takeLast(2)}")
}
