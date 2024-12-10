// Sumas parciales de Fibonacci: Implementa un algoritmo para calcular la
//suma de los primeros N términos de la serie de Fibonacci

fun main() {
    // Solicita al usuario la cantidad de términos
    println("Ingrese la cantidad de términos de la serie de Fibonacci para sumar:")
    val n = readLine()?.toIntOrNull() ?: 0

    if (n <= 0) {
        println("Por favor, ingrese un número mayor a 0.")
    } else {
        val suma = sumaFibonacci(n)
        println("La suma de los primeros $n términos de la serie de Fibonacci es: $suma")
    }
}

// Función para calcular la suma de los primeros n términos de la serie de Fibonacci
fun sumaFibonacci(n: Int): Int {
    var a = 0
    var b = 1
    var suma = a + b

    if (n == 1) return a
    if (n == 2) return suma

    for (i in 3..n) {
        val siguiente = a + b
        suma += siguiente
        a = b
        b = siguiente
    }

    return suma
}