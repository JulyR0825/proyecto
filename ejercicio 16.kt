//Raíces de polinomios: Diseña un programa que encuentre todas las raíces
//reales de un polinomio de tercer grado.

import kotlin.math.*

fun main() {
    // Leer los coeficientes del polinomio de tercer grado
    println("Introduce el coeficiente a (para x^3):")
    val a = readLine()!!.toDouble()

    println("Introduce el coeficiente b (para x^2):")
    val b = readLine()!!.toDouble()

    println("Introduce el coeficiente c (para x):")
    val c = readLine()!!.toDouble()

    println("Introduce el coeficiente d (constante):")
    val d = readLine()!!.toDouble()

    // Función para el polinomio de tercer grado
    fun f(x: Double): Double {
        return a * x * x * x + b * x * x + c * x + d
    }

    // Derivada del polinomio (para el método de Newton-Raphson)
    fun df(x: Double): Double {
        return 3 * a * x * x + 2 * b * x + c
    }

    // Método de Newton-Raphson para encontrar una raíz real
    fun newtonRaphson(initialGuess: Double): Double {
        var x = initialGuess
        var epsilon = 1e-6 // Precisión
        var delta = f(x) / df(x)

        while (abs(delta) > epsilon) {
            delta = f(x) / df(x)
            x = x - delta
        }
        return x
    }

    // Encontrar las raíces utilizando el método de Newton-Raphson
    val roots = mutableListOf<Double>()

    // Intentamos diferentes valores iniciales para encontrar las raíces
    val initialGuesses = listOf(-1.0, 0.0, 1.0, 2.0, -2.0)
}