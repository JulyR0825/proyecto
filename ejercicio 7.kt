//Dados 3 números determinar el mayor
// e informar por pantalla el resultado
fun main() {
    // Solicitar al usuario los tres números
    println("Ingresa el primer número:")
    val num1 = readln().toInt()

    println("Ingresa el segundo número:")
    val num2 = readln().toInt()

    println("Ingresa el tercer número:")
    val num3 = readln().toInt()

    // Determinar el mayor número
    val mayor = when {
        num1 >= num2 && num1 >= num3 -> num1
        num2 >= num1 && num2 >= num3 -> num2
        else -> num3
    }

    // Mostrar el resultado
    println("El mayor de los tres números es: $mayor")
}