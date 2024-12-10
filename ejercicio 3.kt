//Posición en Fibonacci: Escribe una función que determine si un número
//dado pertenece a la serie de Fibonacci. Si pertenece, devuelve su posición.

fun main() {
    // Solicita al usuario un número
    println("Ingrese un número para verificar:")
    val numero = readLine()?.toIntOrNull() ?: 0

    // Verifica si el número pertenece a la serie de Fibonacci y es primo
    val esFibonacci = perteneceAFibonacci(numero)
    val esPrimo = esNumeroPrimo(numero)

    // Muestra el resultado
    if (esFibonacci && esPrimo) {
        println("El número $numero pertenece a la serie de Fibonacci y es primo.")
    } else if (esFibonacci) {
        println("El número $numero pertenece a la serie de Fibonacci pero no es primo.")
    } else if (esPrimo) {
        println("El número $numero es primo pero no pertenece a la serie de Fibonacci.")
    } else {
        println("El número $numero no pertenece a la serie de Fibonacci ni es primo.")
    }
}

// Función para verificar si un número pertenece a la serie de Fibonacci
fun perteneceAFibonacci(n: Int): Boolean {
    if (n < 0) return false
    var a = 0
    var b = 1
    while (a <= n) {
        if (a == n) return true
        val temp = a + b
        a = b
        b = temp
    }
    return false
}

// Función para verificar si un número es primo
fun esNumeroPrimo(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}