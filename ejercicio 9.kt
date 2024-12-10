//Optimización de funciones: Escribe un programa que encuentre el
//mínimo o máximo de una función cuadrática mediante el cálculo de su
//derivada
fun main() {
    // Solicitar al usuario los coeficientes de la función cuadrática
    println("Ingrese el coeficiente a (de x^2):")
    val a = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida.")

    println("Ingrese el coeficiente b (de x):")
    val b = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida.")

    println("Ingrese el coeficiente c (constante):")
    val c = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida.")

    // Verificar si la parábola tiene un mínimo o un máximo
    if (a == 0.0) {
        println("El coeficiente 'a' no puede ser 0. Esto no es una función cuadrática.")
        return
    }

    // Calcular el vértice (x del mínimo o máximo)
    val xVertice = -b / (2 * a)

    // Evaluar la función en el vértice
    val yVertice = evaluarFuncionCuadratica(a, b, c, xVertice)

    // Determinar si es un mínimo o un máximo
    val tipo = if (a > 0) "mínimo" else "máximo"

    // Mostrar el resultado
    println("La función tiene un $tipo en el punto ($xVertice, $yVertice).")
}

// Función para evaluar la función cuadrática f(x) = ax^2 + bx + c
fun evaluarFuncionCuadratica(a: Double, b: Double, c: Double, x: Double): Double {
    return a * x * x + b * x + c
}