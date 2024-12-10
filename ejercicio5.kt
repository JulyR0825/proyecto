// calcular la nota del trimestre apartir de tres notas luego determinar
// si aprobo o debe recuperar e informarlo
fun main (){
    val cal1= readln().toInt()
    val cal2= readln().toInt()
    val cal3= readln().toInt()
    val promedio= (cal1+cal2+cal3)/ 3

    if (promedio>=7){
        println("aprobado")
    }
    else if (promedio<7){
        println("reprobado")
    }
}