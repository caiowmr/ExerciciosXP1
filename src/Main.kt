import exeXP.*

fun main() {
    while (true) {
        println("\nEscolha o exercício que deseja usar:")
        println("1. Exercício 1: Verificação de Números Primos")
        println("2. Exercício 2: Contagem de Palavras")
        println("3. Exercício 3: Gestão de Notas dos Alunos")
        println("4. Exercício 4: Ordenação de Nomes de Alunos")
        println("5. Exercício 5: Simulação de Jogo de Dados")
        println("6. Exercício 6: Análise de Dados Meteorológicos")
        println("7. Exercício 7: Sistema de Reserva de Passagens Aéreas")
        println("8. Exercício 8: Sistema de Gestão de Estoque com Reposição Automática")
        println("9. Sair")
        print("Escolha uma opção: ")

        when (readLine()?.toIntOrNull()) {
            1 -> Exercicio1.primo()
            2 -> Exercicio2.main()
            3 -> Exercicio3.main()
            4 -> Exercicio4.main()
            5 -> Exercicio5.main()
            6 -> Exercicio6.main()
            7 -> Exercicio7.main()
            8 -> Exercicio8.main()
            9 -> {
                println("Saindo do programa...")
                return
            }
        }
    }
}
