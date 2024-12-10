//Resolución de sistemas lineales: Implementa una función que resuelva
//un sistema de ecuaciones lineales usando
// el método del gauus
fun main() {
    // Ejemplo: Sistema de ecuaciones con 3 variables
    val matrizAumentada = arrayOf(
        doubleArrayOf(2.0, 1.0, -1.0, 8.0), // 2x + y - z = 8
        doubleArrayOf(-3.0, -1.0, 2.0, -11.0), // -3x - y + 2z = -11
        doubleArrayOf(-2.0, 1.0, 2.0, -3.0)  // -2x + y + 2z = -3
    )

    println("Matriz aumentada inicial:")
    imprimirMatriz(matrizAumentada)

    val soluciones = gaussEliminacion(matrizAumentada)

    println("\nSoluciones:")
    soluciones.forEachIndexed { index, valor ->
        println("x${index + 1} = $valor")
    }
}

// Función para resolver un sistema de ecuaciones lineales usando el método de Gauss
fun gaussEliminacion(matriz: Array<DoubleArray>): DoubleArray {
    val n = matriz.size

    // Proceso de eliminación hacia adelante
    for (i in 0 until n) {
        // Escoger el pivote
        val pivote = matriz[i][i]
        if (pivote == 0.0) {
            throw IllegalArgumentException("El sistema no tiene una solución única.")
        }

        // Normalizar la fila del pivote
        for (j in i until n + 1) {
            matriz[i][j] /= pivote
        }

        // Hacer ceros en la columna del pivote para las filas inferiores
        for (k in i + 1 until n) {
            val factor = matriz[k][i]
            for (j in i until n + 1) {
                matriz[k][j] -= factor * matriz[i][j]
            }
        }
    }

    println("\nMatriz después de la eliminación hacia adelante:")
    imprimirMatriz(matriz)

    // Sustitución hacia atrás para encontrar las soluciones
    val soluciones = DoubleArray(n)
    for (i in n - 1 downTo 0) {
        var suma = 0.0
        for (j in i + 1 until n) {
            suma += matriz[i][j] * soluciones[j]
        }
        soluciones[i] = matriz[i][n] - suma
    }

    return soluciones
}

// Función para imprimir una matriz
fun imprimirMatriz(matriz: Array<DoubleArray>) {
    for (fila in matriz) {
        println(fila.joinToString(" ") { "%.2f".format(it) })
    }
}