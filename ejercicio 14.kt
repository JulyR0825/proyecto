// Ingresar 10 valores numéricos por teclado y
// calcular la suma, el promedio e imprimir la suma,
// el promedio agregando una leyenda en cada caso.

fun main() {
    val numeros = mutableListOf<Int>()

    // Pedimos al usuario ingresar 10 números
    for (i in 1..10) {
        print("Ingrese el número $i: ")
        val numero = readLine()?.toIntOrNull() ?: 0
        numeros.add(numero)
    }

    // Calculamos la suma
    val suma = numeros.sum()

    // Calculamos el promedio
    val promedio = suma / numeros.size.toDouble()

    // Imprimimos los resultados con leyendas
    println("La suma de los números es: $suma")
    println("El promedio de los números es: $promedio")
}