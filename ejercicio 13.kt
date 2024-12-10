//Autovalores y autovectores: Escribe un programa para calcular los
//autovalores de una matriz 2x2
import kotlin.math.sqrt

fun main() {
    // Solicitar al usuario los elementos de la matriz 2x2
    println("Ingrese el valor de a (posición [1][1]):")
    val a = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida.")

    println("Ingrese el valor de b (posición [1][2]):")
    val b = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida.")

    println("Ingrese el valor de c (posición [2][1]):")
    val c = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida.")

    println("Ingrese el valor de d (posición [2][2]):")
    val d = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida.")

    // Calcular los autovalores de la matriz 2x2
    val autovalores = calcularAutovalores(a, b, c, d)

    println("Los autovalores de la matriz son:")
    println("λ1 = ${autovalores.first}")
    println("λ2 = ${autovalores.second}")
}

// Función para calcular los autovalores de una matriz 2x2
fun calcularAutovalores(a: Double, b: Double, c: Double, d: Double): Pair<Double, Double> {
    // Coeficientes de la ecuación cuadrática
    val traza = a + d      // La traza (a + d)
    val determinante = a * d - b * c // El determinante (ad - bc)

    // Calcular el discriminante
    val discriminante = traza * traza - 4 * determinante

    if (discriminante < 0) {
        throw IllegalArgumentException("Los autovalores son complejos, ya que el discriminante es negativo.")
    }

    // Fórmula cuadrática para los autovalores
    val lambda1 = (traza + sqrt(discriminante)) / 2
    val lambda2 = (traza - sqrt(discriminante)) / 2

    return Pair(lambda1, lambda2)
}