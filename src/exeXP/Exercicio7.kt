package exeXP

class Voo(val numeroDoVoo: String, private val assentosDisponiveis: IntArray) {

    fun verificarDisponibilidade(assento: Int): Boolean {
        return assento in assentosDisponiveis
    }

    // Função para reservar um assento
    fun reservarAssento(assento: Int): Boolean {
        val index = assentosDisponiveis.indexOf(assento)
        if (index != -1) {
            assentosDisponiveis[index] = -1
            return true
        }
        return false
    }
}

class Exercicio7 {
    companion object {
        fun main() {
            val numeroDoVoo = "1234"
            val assentosDisponiveis = IntArray(10) { it + 1 }
            val voo = Voo(numeroDoVoo, assentosDisponiveis)

            println("Bem-vindo ao sistema de reserva de passagens aéreas!")
            while (true) {
                println("\nMenu:")
                println("1. Verificar disponibilidade de assento")
                println("2. Reservar assento")
                println("3. Sair")
                print("Escolha uma opção: ")
                when (readLine()?.toIntOrNull()) {
                    1 -> {
                        print("Digite o número do assento para verificar: ")
                        val assento = readLine()?.toIntOrNull()
                        if (assento != null && assento in assentosDisponiveis) {
                            if (voo.verificarDisponibilidade(assento)) {
                                println("O assento $assento está disponível.")
                            } else {
                                println("O assento $assento já está reservado.")
                            }
                        } else {
                            println("Número de assento inválido.")
                        }
                    }
                    2 -> {
                        print("Digite o número do assento para reservar: ")
                        val assento = readLine()?.toIntOrNull()
                        if (assento != null && assento in assentosDisponiveis) {
                            if (voo.reservarAssento(assento)) {
                                println("Assento $assento reservado com sucesso.")
                            } else {
                                println("O assento $assento não está disponível.")
                            }
                        } else {
                            println("Número de assento inválido.")
                        }
                    }
                    3 -> {
                        println("Saindo do sistema...")
                        return
                    }
                    else -> println("Opção inválida. Tente novamente.")
                }
            }
        }
    }
}
