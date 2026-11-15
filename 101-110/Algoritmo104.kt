// Algoritmo 104
// Enunciado: Aceitar pessoa do sexo feminino com menos de 25 anos; caso contrário, não aceitar.

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
    val sexo = lerTexto("Digite o sexo (F/M): ")
    val idade = lerInt("Digite a idade: ")
    if ((sexo.equals("F", true)) && idade < 25) println("$nome - ACEITA")
    else println("$nome - NÃO ACEITA")
}
