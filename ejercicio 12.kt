//Ingresar un valor por teclado y determinar si es menor que 10 si está
// comprendido entre 10 y 100 o si es mayor a 100,
// imprimir una leyenda, repetir el proceso 10 veces,
fun main() {
    repeat(10) {
        print("Ingrese un número: ")
        val numero = readLine()?.toIntOrNull() ?: 0

        when {
            numero < 10 -> println("El número es menor que 10")
            numero in 10..100 -> println("El número está entre 10 y 100")
            else -> println("El número es mayor que 100")
        }
    }
}