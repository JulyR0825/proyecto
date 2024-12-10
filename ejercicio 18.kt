//. Factorización optimizada: Diseña una función para descomponer un
//número en sus factores primos de forma eficiente

fun main() {
    println("Ingrese un número para descomponer en factores primos:")
    val num = readLine()?.toIntOrNull() ?: return println("Entrada inválida.")

    if (num <= 1) {
        println("El número debe ser mayor que 1.")
        return
    }

    val factoresPrimos = descomponerEnFactoresPrimos(num)

    println("Los factores primos de $num son: ${factoresPrimos.joinToString(", ")}")
}

// Función para descomponer un número en sus factores primos
fun descomponerEnFactoresPrimos(n: Int): List<Int> {
    val factores = mutableListOf<Int>()
    var num = n

    // Dividir por 2 hasta que no sea divisible
    while (num % 2 == 0) {
        factores.add(2)
        num /= 2
    }

    // Dividir por números impares desde 3 hasta la raíz cuadrada de n
    var divisor = 3
    while (divisor * divisor <= num) {
        while (num % divisor == 0) {
            factores.add(divisor)
            num /= divisor
        }
        divisor += 2
    }

    // Si el número es mayor que 2 y es primo, agregarlo a los factores
    if (num > 2) {
        factores.add(num)
    }

    return factores
}