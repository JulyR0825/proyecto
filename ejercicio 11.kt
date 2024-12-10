//En un curso de computación, que consta de 24 alumnos, deberán armar un
// algoritmo que informe por pantalla el apellido
// y nombre junto a la nota de examen de cada alumno.
fun main() {
    // Datos de los alumnos (puedes reemplazar estos datos con los que necesites)
    val alumnos = listOf(
        Alumno("Pérez", "Juan", 8),
        Alumno("Gómez", "María", 7),
        // ... agregar más alumnos aquí
    )

    // Recorrer la lista de alumnos e imprimir sus datos
    alumnos.forEach { alumno ->
        println("Apellido: ${alumno.apellido}, Nombre: ${alumno.nombre}, Nota: ${alumno.nota}")
    }
}


// Clase para representar a un alumno
data class Alumno(val apellido: String, val nombre: String, val nota: Int)