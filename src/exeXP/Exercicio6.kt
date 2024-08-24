package exeXP

class Exercicio6 {
    companion object {

        private fun calcularMedia(temperaturas: DoubleArray): Double {
            return temperaturas.average()
        }


        private fun encontrarTemperaturaMaxima(temperaturas: DoubleArray): Pair<Double, List<Int>> {
            val maxTemp = temperaturas.maxOrNull() ?: Double.MIN_VALUE
            val diasMax = temperaturas.indices.filter { temperaturas[it] == maxTemp }
            return Pair(maxTemp, diasMax.map { it + 1 }) // Dias são 1-indexados
        }


        private fun encontrarTemperaturaMinima(temperaturas: DoubleArray): Pair<Double, List<Int>> {
            val minTemp = temperaturas.minOrNull() ?: Double.MAX_VALUE
            val diasMin = temperaturas.indices.filter { temperaturas[it] == minTemp }
            return Pair(minTemp, diasMin.map { it + 1 }) // Dias são 1-indexados
        }


        fun main() {
            val temperaturas = DoubleArray(30)


            for (i in temperaturas.indices) {
                print("Digite a temperatura do dia ${i + 1}: ")
                temperaturas[i] = readLine()?.toDoubleOrNull() ?: 0.0
            }


            val media = calcularMedia(temperaturas)
            val (tempMax, diasMax) = encontrarTemperaturaMaxima(temperaturas)
            val (tempMin, diasMin) = encontrarTemperaturaMinima(temperaturas)


            println("\nAnálise das temperaturas:")
            println("Temperatura média: %.2f".format(media))
            println("Temperatura máxima: %.2f (Dias: ${diasMax.joinToString()})".format(tempMax))
            println("Temperatura mínima: %.2f (Dias: ${diasMin.joinToString()})".format(tempMin))
        }
    }
}
