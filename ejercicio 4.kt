//ingresar la nota del examen de programacion y si es mayor o igual a siete imprimir que aprobò, si no que debe recuperar
fun main (){
    var cal = readln().toInt()
    if(cal>=7){
        println("aprobado")
    }
    else if ( cal<7){
        println("reprobado")
    }
}