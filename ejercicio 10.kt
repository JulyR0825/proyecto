//Ingresar un valor por teclado y determinar si es positivo,
// negativo o igual a cero, imprimir una leyenda en cada caso
fun main() {
    print("Ingrese un número: ")
    val numero = readLine()?.toIntOrNull()

    when (numero) {
        null -> println("Entrada inválida. Ingrese un número entero.")
        0 -> println("El número es cero.")
        in Int.MIN_VALUE until 0 -> println("El número es negativo.")
        else -> println("El número es positivo.")
    }
}