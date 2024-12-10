//implementa una funcion que calcule los primeros
// de la serie de fibonacci en orden inverso

fun main() {
    // Solicitar al usuario el número de términos de la serie Fibonacci
    println("Ingrese el número de términos de la serie Fibonacci:")
    val n = readLine()?.toIntOrNull() ?: return println("Entrada inválida.")

    if (n <= 0) {
        println("El número de términos debe ser mayor que 0.")
        return
    }

    // Obtener los primeros N números de Fibonacci en orden inverso
    val fibonacciInverso = calcularFibonacciInverso(n)

    // Mostrar los números de Fibonacci en orden inverso
    println("Los primeros $n números de la serie Fibonacci en orden inverso son:")
    println(fibonacciInverso.joinToString(", "))
}

// Función para calcular los primeros N números de Fibonacci en orden inverso
fun calcularFibonacciInverso(n: Int): List<Int> {

    // Inicializar la lista de Fibonacci con los primeros dos términos
    val fibonacci = mutableListOf(0, 1)

    // Calcular los siguientes términos de la serie de Fibonacci
    for (i in 2 until n) {
        val siguienteTermino = fibonacci[i - 1] + fibonacci[i - 2]
        fibonacci.add(siguienteTermino)
    }

    // Retornar la lista de Fibonacci invertida
    return fibonacci.take(n).reversed()
}