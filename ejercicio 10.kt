//Cálculo numérico de integrales: Diseña una función para calcular la
//integral definida de una función en un intervalo utilizando el método del
//trapecio
fun main() {
    // Define la función que deseas integrar
    val funcion: (Double) -> Double = { x -> x * x } // Ejemplo: f(x) = x^2

    // Intervalo de integración [a, b] y número de trapecios
    val a = 0.0  // Límite inferior
    val b = 1.0  // Límite superior
    val n = 1000 // Número de trapecios

    // Calcula la integral usando el método del trapecio
    val resultado = integrarPorTrapecio(funcion, a, b, n)

    // Muestra el resultado
    println("La integral de la función en el intervalo [$a, $b] es aproximadamente: $resultado")
}

// Función para calcular la integral definida usando el método del trapecio
fun integrarPorTrapecio(f: (Double) -> Double, a: Double, b: Double, n: Int): Double {
    val h = (b - a) / n // Ancho de cada subintervalo (trapecio)
    var suma = 0.0

    // Suma los valores de la función en los extremos y los puntos intermedios
    for (i in 0..n) {
        val x = a + i * h
        suma += if (i == 0 || i == n) f(x) else 2 * f(x) // Extremos: una vez, Intermedios: dos veces
    }

    return (h / 2) * suma
}