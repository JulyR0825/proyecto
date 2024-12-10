//Tangente a una curva: Dada una función y un punto, calcula la ecuación
//de la recta tangente en ese punto

fun main() {
    // Solicitar al usuario el punto donde se calcula la recta tangente y el valor de h
    println("Ingrese el punto donde desea calcular la recta tangente (x0):")
    val x0 = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida.")

    println("Ingrese el valor de h (pequeño incremento, por ejemplo 0.001):")
    val h = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida.")

    // Definir la función f(x)
    val funcion = { x: Double -> x * x } // Ejemplo: f(x) = x^2

    // Calcular la pendiente de la tangente (derivada en x0)
    val pendiente = derivadaPorDiferenciasFinitas (funcion, x0, h)

    // Calcular el valor de f(x0)
    val y0 = funcion(x0)

    // Mostrar la ecuación de la recta tangente
    println("La ecuación de la recta tangente en el punto ($x0, $y0) es:")
    println("y = ${pendiente}x + ${y0 - pendiente * x0}")
}

// Función para calcular la derivada usando diferencias finitas
fun derivadaPorDiferenciasFinitas(f: (Double) -> Double, x: Double, h: Double): Double {
    return (f(x + h) - f(x)) / h

}