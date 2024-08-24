package exeXP

class Exercicio4 {
    companion object {

        fun main() {
            val nomes = Array(10) { "" }


            for (i in nomes.indices) {
                print("Digite o nome do aluno ${i + 1}: ")
                nomes[i] = readLine() ?: ""
            }


            nomes.sort()


            println("\nLista de alunos em ordem alfabética:")
            for ((index, nome) in nomes.withIndex()) {
                println("${index + 1}. $nome")
            }
        }
    }
}
