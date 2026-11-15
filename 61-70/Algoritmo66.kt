// Algoritmo 66
// Enunciado: Calcular distância percorrida e litros usados em uma viagem.

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
    val tempo = lerDouble("Digite o tempo da viagem em horas: ")
    val velocidade = lerDouble("Digite a velocidade média em km/h: ")
    val distancia = tempo * velocidade
    val litros = distancia / 12
    println("Velocidade média: $velocidade km/h")
    println("Tempo: $tempo horas")
    println("Distância: $distancia km")
    println("Litros utilizados: $litros")
}
