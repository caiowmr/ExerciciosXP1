package exeXP

class Produto(
    val nome: String,
    var quantidade: Int,
    val nivelMinimo: Int,
    val nivelMaximo: Int
) {

    fun verificarEReporEstoque() {
        if (quantidade < nivelMinimo) {
            reporEstoque()
        }
    }


    private fun reporEstoque() {
        quantidade = nivelMaximo
        println("Estoque do produto '$nome' reposto para o nível máximo de $nivelMaximo unidades.")
    }
}

class Exercicio8 {
    companion object {

        fun main() {
            val produtos = mutableListOf<Produto>()


            for (i in 1..5) {
                println("Cadastro do Produto $i")
                print("Nome: ")
                val nome = readLine() ?: "Produto $i"
                print("Quantidade atual: ")
                val quantidade = readLine()?.toIntOrNull() ?: 0
                print("Nível mínimo: ")
                val nivelMinimo = readLine()?.toIntOrNull() ?: 0
                print("Nível máximo: ")
                val nivelMaximo = readLine()?.toIntOrNull() ?: 0

                val produto = Produto(nome, quantidade, nivelMinimo, nivelMaximo)
                produtos.add(produto)
            }

            println("\nVerificação de Estoque:")
            produtos.forEach { produto ->
                produto.verificarEReporEstoque()
                println("Produto: ${produto.nome}, Quantidade Atual: ${produto.quantidade}")
            }
        }
    }
}
