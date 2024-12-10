//Número de caminos: Calcula el número de caminos posibles en una
//cuadrícula NxN, moviéndose solo hacia la derecha o hacia abajo

fun main() {
    // Solicitar al usuario el tamaño de la cuadrícula (N)
    println("Ingrese el valor de N para una cuadrícula NxN:")
    val n = readLine()?.toIntOrNull() ?: return println("Entrada inválida.")

    if (n <= 0) {
        println("N debe ser un número positivo.")
        return
    }

    // Calcular el número de caminos posibles en una cuadrícula NxN
    val caminos = calcularNumeroDeCaminos(n)

    // Mostrar el resultado
    println("El número de caminos posibles en una cuadrícula de tamaño $n x $n es: $caminos")
}

// Función para calcular el número de caminos posibles usando la fórmula combinatoria
fun calcularNumeroDeCaminos(n: Int): Long {
    // El número de caminos es el coeficiente binomial (2N sobre N)
    return factorial(2 * n) / (factorial(n) * factorial(n))
}

// Función para calcular el factorial de un número
fun factorial(n: Int): Long {
    var resultado: Long = 1
    for (i in 1..n) {
        resultado *= i
    }
    return resultado
}