// Determinante de una matriz: Crea una función que calcule el
//determinante de matrices de hasta 4x4

fun main() {

    // Ejemplo de una matriz 4x4
    val matriz = arrayOf(
        doubleArrayOf(1.0, 2.0, 3.0, 4.0),
        doubleArrayOf(5.0, 6.0, 7.0, 8.0),
        doubleArrayOf(9.0, 10.0, 11.0, 12.0),
        doubleArrayOf(13.0, 14.0, 15.0, 16.0)
    )

    // Calcular el determinante de la matriz
    val determinante = calcularDeterminante(matriz)

    println("El determinante de la matriz es: $determinante")
}

// Función para calcular el determinante de una matriz de hasta 4x4
fun calcularDeterminante(matriz: Array<DoubleArray>): Double {
    val n = matriz.size

    // Si la matriz es 2x2, calcular directamente el determinante
    if (n == 2) {
        return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0]
    }

    // Si la matriz es 3x3 o 4x4, usar la expansión por cofactores
    var determinante = 0.0
    for (columna in 0 until n) {
        determinante += matriz[0][columna] * cofactor(matriz, 0, columna)
    }

    return determinante
}

// Función auxiliar para calcular el cofactor de una matriz
fun cofactor(matriz: Array<DoubleArray>, fila: Int, columna: Int): Double {
    // Crear una submatriz eliminando la fila y la columna especificadas
    val submatriz = Array(matriz.size - 1) { DoubleArray(matriz.size - 1) }
    var submatrizFila = 0
    for (i in matriz.indices) {
        if (i == fila) continue
        var submatrizColumna = 0
        for (j in matriz[i].indices) {
            if (j == columna) continue
            submatriz[submatrizFila][submatrizColumna] = matriz[i][j]
            submatrizColumna++
        }
        submatrizFila++
    }

    // Calcular el determinante de la submatriz
    return (-1.0).pow(fila + columna) * calcularDeterminante(submatriz)
}

// Función para calcular el determinante de una matriz de tamaño 2x2
fun calcularDeterminante(matriz: Array<DoubleArray>): Double {
    return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0]
}

// Función para calcular la potencia de un número
fun Double.pow(exponente: Int): Double {
    return Math.pow(this, exponente.toDouble())
}