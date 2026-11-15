// Algoritmo 103
// Enunciado: Calcular a idade a partir do ano de nascimento e do ano atual, validando o ano.

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
    val anoAtual = lerInt("Digite o ano atual: ")
    val anoNascimento = lerInt("Digite o ano de nascimento: ")
    if (anoNascimento > anoAtual || anoNascimento <= 0) println("Ano de nascimento inválido")
    else println("Idade aproximada: ${anoAtual - anoNascimento} anos")
}
