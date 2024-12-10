//Ingresar 100 valores por teclado y determinar cuántas veces el valor ingresado es:
// a) Mayor a 0 y menor a 10
// b) Esta comprendido entre 10 y 100 ambos inclusive.
// c) Es mayor a 100 d) Es i gativo e) Es igual a Olmprimir los resultados.
fun main() {
    var contadorMayorCeroMenorDiez = 0
    var contadorEntreDiezYCien = 0
    var contadorMayorCien = 0
    var contadorNegativo = 0
    var contadorCero = 0

    for (i in 1..100) {
        print("Ingrese el valor $i: ")
        val valor = readLine()?.toIntOrNull() ?: 0

        when {
            valor > 0 && valor < 10 -> contadorMayorCeroMenorDiez++
            valor in 10..100 -> contadorEntreDiezYCien++
            valor > 100 -> contadorMayorCien++
            valor < 0 -> contadorNegativo++
            valor == 0 -> contadorCero++
        }
    }

    println("\nResultados:")
    println("Valores entre 1 y 9: $contadorMayorCeroMenorDiez")
    println("Valores entre 10 y 100: $contadorEntreDiezYCien")
    println("Valores mayores a 100: $contadorMayorCien")
    println("Valores negativos: $contadorNegativo")
    println("Valores iguales a cero: $contadorCero")
}