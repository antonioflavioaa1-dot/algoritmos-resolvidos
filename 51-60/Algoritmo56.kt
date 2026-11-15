// Algoritmo 56
// Enunciado: Ler nome e idade e mostrar os dados informados.

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
    val nome = lerTexto("Digite o nome: ")
    val idade = lerInt("Digite a idade: ")
    println("Nome: $nome")
    println("Idade: $idade")
}
