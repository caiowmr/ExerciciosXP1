package exeXP

import kotlin.random.Random

class Exercicio5 {
    companion object {

        private fun lancarDados(): Int {
            val dado1 = Random.nextInt(1, 7)
            val dado2 = Random.nextInt(1, 7)
            return dado1 + dado2
        }


        fun main() {
            print("Quantas vezes você deseja lançar os dados? ")
            val numLancamentos = readLine()?.toIntOrNull() ?: 1


            println("\nResultados dos lançamentos:")
            repeat(numLancamentos) { i ->
                val soma = lancarDados()
                println("Lançamento ${i + 1}: Soma = $soma")
            }
        }
    }
}
