// Números amigables: Escribe un programa para
// determinar si dos
//números dados son amigables (la suma de los divisores
// de uno es igual al
//otro y viceversa).

fun main() {
    // Solicitar al usuario dos números
    println("Ingrese el primer número:")
    val num1 = readLine()?.toIntOrNull() ?: return println("Entrada inválida.")

    println("Ingrese el segundo número:")
    val num2 = readLine()?.toIntOrNull() ?: return println("Entrada inválida.")

    // Verificar si los números son amigables
    if (sonAmigables(num1, num2)) {
        println("$num1 y $num2 son números amigables.")
    } else {
        println("$num1 y $num2 no son números amigables.")
    }
}

// Función para calcular la suma de los divisores propios de un número
fun sumaDivisoresPropios(num: Int): Int {
    var suma = 0
    for (i in 1 until num) {
        if (num % i == 0) {
            suma += i
        }
    }
    return suma
}

// Función para verificar si dos números son amigables
fun sonAmigables(num1: Int, num2: Int): Boolean {
    // Verificar si la suma de los divisores de cada número es igual al otro número
    return sumaDivisoresPropios(num1) == num2 && sumaDivisoresPropios(num2) == num1
}