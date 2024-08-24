package exeXP

class Aluno(val nome: String, val notas: DoubleArray)

class Exercicio3 {
    companion object {

        private fun calcularMedia(notas: DoubleArray): Double {
            return notas.average()
        }

        private fun foiAprovado(media: Double): Boolean {
            return media >= 7.0
        }


        fun main() {
            val alunos = mutableListOf<Aluno>()


            for (i in 1..5) {
                println("Cadastro do aluno $i:")
                print("Nome: ")
                val nome = readLine() ?: ""


                val notas = DoubleArray(3)
                for (j in notas.indices) {
                    print("Nota ${j + 1}: ")
                    notas[j] = readLine()?.toDoubleOrNull() ?: 0.0
                }


                val aluno = Aluno(nome, notas)
                alunos.add(aluno)
            }


            println("\nResultado das médias e aprovação dos alunos:")
            for (aluno in alunos) {
                val media = calcularMedia(aluno.notas)
                val status = if (foiAprovado(media)) "Aprovado" else "Reprovado"
                println("${aluno.nome} - Média: %.2f - Status: $status".format(media))
            }
        }
    }
}
