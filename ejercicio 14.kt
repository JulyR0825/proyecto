//. Multiplicación de matrices grandes: Implementa un algoritmo para
//multiplicar dos matrices dispersas eficientemente

fun main() {
    // Definir las matrices dispersas usando listas de tripletas (fila, columna, valor)
    val matrizA = listOf(
        Triple(0, 0, 1), // fila 0, columna 0, valor 1
        Triple(0, 2, 3), // fila 0, columna 2, valor 3
        Triple(1, 1, 4), // fila 1, columna 1, valor 4
        Triple(2, 0, 2), // fila 2, columna 0, valor 2
        Triple(2, 2, 5)  // fila 2, columna 2, valor 5
    )

    val matrizB = listOf(
        Triple(0, 0, 6), // fila 0, columna 0, valor 6
        Triple(0, 2, 7), // fila 0, columna 2, valor 7
        Triple(1, 0, 8), // fila 1, columna 0, valor 8
        Triple(2, 1, 9), // fila 2, columna 1, valor 9
        Triple(2, 2, 10) // fila 2, columna 2, valor 10
    )

    // Especificar las dimensiones de las matrices
    val filasA = 3
    val columnasA = 3
    val filasB = 3
    val columnasB = 3

    // Realizar la multiplicación de matrices dispersas
    val resultado = multiplicarMatricesDispersas(matrizA, matrizB, filasA, columnasA, filasB, columnasB)

    // Imprimir el resultado
    println("Matriz resultado:")
    for (elemento in resultado) {
        println("Fila: ${elemento.first}, Columna: ${elemento.second}, Valor: ${elemento.third}")
    }
}

// Función para multiplicar matrices dispersas
fun multiplicarMatricesDispersas(
    matrizA: List<Triple<Int, Int, Int>>,
    matrizB: List<Triple<Int, Int, Int>>,
    filasA: Int, columnasA: Int, filasB: Int, columnasB: Int
): List<Triple<Int, Int, Int>> {
    if (columnasA != filasB) {
        throw IllegalArgumentException("El número de columnas de A debe ser igual al número de filas de B.")
    }

    // Convertir matrizB en un mapa para búsqueda rápida
    val matrizBMap = mutableMapOf<Pair<Int, Int>, Int>()
    for (elem in matrizB) {
        matrizBMap[Pair(elem.first, elem.second)] = elem.third
    }

    // Resultado: Lista de tripletas (fila, columna, valor)
    val resultado = mutableListOf<Triple<Int, Int, Int>>()

    // Multiplicar las matrices
    for (i in 0 until filasA) {
        for (j in 0 until columnasB) {
            var suma = 0
            for (k in 0 until columnasA) {
                // Buscar el valor de A[i, k]
                val valorA = matrizA.find { it.first == i && it.second == k }?.third ?: 0
                // Buscar el valor de B[k, j]
                val valorB = matrizBMap[Pair(k, j)] ?: 0

                suma += valorA * valorB
            }
            // Solo agregar al resultado si la suma no es cero
            if (suma != 0) {
                resultado.add(Triple(i, j, suma))
            }
        }
    }

    return resultado
}