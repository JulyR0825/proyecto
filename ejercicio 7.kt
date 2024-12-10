// una expresión
//algebraica (por ejemplo, 3x^2 + 2x)
// y calcule su derivada simbólica

fun main() {
    // Solicitar la expresión algebraica
    println("Introduce una expresión algebraica (por ejemplo, 3x^2 + 2x):")
    val expression = readLine()!!

    // Función para derivar una expresión algebraica simple
    val derivative = derive(expression)
    println("La derivada simbólica es: $derivative")
}

// Función para derivar una expresión algebraica simple
fun derive(expression: String): String {
    // Dividimos la expresión en términos, asumiendo que los términos están separados por '+' o '-'
    val terms = expression.split(Regex("(?=[+-])")).map { it.trim() }

    // Lista para almacenar los términos derivados
    val derivedTerms = mutableListOf<String>()

    for (term in terms) {
        // Expresiones de la forma "3x^2", "x^3", "4x", "x", "3"
        val match = Regex("([+-]?\\d*)x\\^?(\\d*)").find(term)

        if (match != null) {
            // Caso de términos como "3x^2", "x^3"
            val coefficient = match.groupValues[1].takeIf { it.isNotEmpty() }?.toInt() ?: 1
            val exponent = match.groupValues[2].takeIf { it.isNotEmpty() }?.toInt() ?: 1

            // Derivada: d/dx(ax^n) = n * a * x^(n-1)
            if (exponent == 1) {
                derivedTerms.add("${coefficient}")
            } else {
                val newCoefficient = coefficient * exponent
                val newExponent = exponent - 1
                derivedTerms.add("${newCoefficient}x^$newExponent")
            }
        } else if (term.contains("x")) {
            // Caso de términos como "4x" o "x"
            val coefficient = term.dropLast(1).takeIf { it.isNotEmpty() }?.toInt() ?: 1
            derivedTerms.add("$coefficient")
        } else {
            // Caso de término constante
            // La derivada de una constante es cero, así que lo ignoramos
            continue
        }
    }

    // Unimos los términos derivados en una sola cadena, manejando los signos
    return derivedTerms.joinToString(" ") { it.replaceFirst("^", "") }
}