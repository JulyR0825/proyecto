//Aproximación de derivadas: Implementa una
// función que calcule la
//derivada de una función en un
// punto usando diferencias finitas

fun main() {
    // Solicita al usuario la función f(x), el punto y el valor de h
    println("Ingrese el punto donde desea calcular la derivada (x):")
    val x = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida.")

    println("Ingrese el valor de h (pequeño incremento, por ejemplo 0.001):")
    val h = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida.")

    // Define la función f(x)
    val funcion = { x: Double -> x * x } // Ejemplo: f(x) = x^2

    // Calcula la derivada en el punto x
    val derivada = derivadaPorDiferenciasFinitas(funcion, x, h)
    println("La derivada de la función en el punto $x es aproximadamente: $derivada")
}

// Función para calcular la derivada usando diferencias finitas
fun derivadaPorDiferenciasFinitas(f: (Double) -> Double, x: Double, h: Double): Double {
    return (f(x + h) - f(x)) / h
}