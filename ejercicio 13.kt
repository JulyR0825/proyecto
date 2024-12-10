//Ingresar 10 valores por teclado y obtener la
// sumatoria de los mismos.
// Imprimir los resultados.
fun main() {
    var suma = 0

    for (i in 1..10) {
        print("Ingresa el número $i: ")
        val numero = readLine()?.toIntOrNull() ?: 0
        suma += numero
    }

    println("La suma total es: $suma")
}