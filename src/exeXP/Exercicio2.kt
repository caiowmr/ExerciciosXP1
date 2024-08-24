package exeXP

class Exercicio2 {
    companion object {
        fun contarPalavras(paragrafo: String): Int {
            val palavras = paragrafo.trim().split(Regex("\\s+"))
            return palavras.size
        }

        // Função main para executar a lógica
        fun main() {
            println("Digite um parágrafo:")
            val paragrafo = readLine() ?: ""

            val contagem = contarPalavras(paragrafo)

            println("Número de palavras = $contagem")
        }
    }
}

