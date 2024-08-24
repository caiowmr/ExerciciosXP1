package exeXP

class Exercicio1 {

    companion object {
        fun primo() {
            print("Informe um número: ")
            val input = readLine()?.toIntOrNull()

            if (input != null) {
                if (ehPrimo(input)) {
                    println("$input é primo.")
                } else {
                    println("$input não é primo.")
                }
            }
        }

        private fun ehPrimo(num: Int): Boolean {
            if (num <= 1) return false

            for (i in 2 until num) {
                if (num % i == 0) {
                    return false
                }
            }
            return true
        }
    }
}