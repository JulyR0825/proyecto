//Ingresar 10 valores numéricos y obtener el promedio
// los que estén comprendidos entre 5 y 2500 ambos inclusive,
// imprimir el resultado.
fun main() {
    val numeros = mutableListOf<Int>()

    // Pedimos al usuario ingresar 10 números
    println("Ingrese 10 números:")
    repeat(10) {
        print("Número ${it + 1}: ")
        val numero = readLine()?.toIntOrNull() ?: 0
        // Manejamos posibles errores de entrada
        numeros.add(numero)
    }

    // 9Filtramos los números entre 5 y 2500 y calculamos el promedio
    val numerosFiltrados = numeros.filter { it in 5..2500 }
    val promedio = if (numerosFiltrados.isNotEmpty()) {
        numerosFiltrados.average()
    } else {
        0.0 // Si no hay números en el rango, el promedio es 0
    }

    // Imprimimos el resultado
    println("El promedio de los números entre 5 y 2500 es: $promedio")
}