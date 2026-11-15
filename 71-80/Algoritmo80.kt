// Algoritmo 80
// Enunciado: Calcular faturamento, multas e quantidade final de fitas de uma locadora.

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
    val quantidade = lerInt("Digite a quantidade de fitas: ")
    val aluguel = lerDouble("Digite o valor de cada aluguel: ")
    val alugadasPorMes = quantidade / 3.0
    val faturamentoAnual = alugadasPorMes * aluguel * 12
    val multasMensais = aluguel * 0.10 * alugadasPorMes / 10
    val quantidadeFinal = quantidade - quantidade * 0.02 + quantidade / 10.0
    println("Faturamento anual: $faturamentoAnual")
    println("Multas mensais: $multasMensais")
    println("Quantidade final de fitas: $quantidadeFinal")
}
