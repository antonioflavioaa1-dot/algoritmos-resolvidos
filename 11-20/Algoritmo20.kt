// Algoritmo 20
// Enunciado: Ler duas palavras e demonstrar operações básicas com texto.

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
    val palavra1 = lerTexto("Digite a primeira palavra: ")
    val palavra2 = lerTexto("Digite a segunda palavra: ")
    println("Tamanho da primeira palavra: ${palavra1.length}")
    println("Concatenação: $palavra1$palavra2")
    val copia = palavra1
    println("Cópia: $copia")
    println("Primeiro caractere: ${palavra1.firstOrNull() ?: ""}")
    println("Último caractere: ${palavra1.lastOrNull() ?: ""}")
    println("Todos menos o primeiro: ${palavra1.drop(1)}")
    println("Terceiro caractere: ${palavra1.getOrNull(2) ?: ""}")
    println("Três primeiros: ${palavra1.take(3)}")
    println("Três últimos: ${palavra1.takeLast(3)}")
}
