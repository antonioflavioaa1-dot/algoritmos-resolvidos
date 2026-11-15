// Algoritmo 35
// Enunciado: Ler nome, endereço e telefone e depois mostrar os dados.

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
    val endereco = lerTexto("Digite o endereço: ")
    val telefone = lerTexto("Digite o telefone: ")
    println("Nome: $nome")
    println("Endereço: $endereco")
    println("Telefone: $telefone")
}
