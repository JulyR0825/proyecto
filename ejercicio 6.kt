//Realizar un algoritmo para determinar
// el sueldo de un empleado, teniendo en cuenta que si trabajo menos de 5
// años la antigüedad será del 30% y si
// trabajo igual o más de 5 años del 50%.
// (Sueldoacobrar= (sueldo+sueldo)*%)

fun main (){
    val years_trabajados= readln().toInt()
    val salary= readln().toInt()
    var porcentaje =0

    if (years_trabajados<5){
        porcentaje= 30
    }
    else if ( years_trabajados>=5){
        porcentaje= 50
    }
    val salario_cobrar=salary + (salary*porcentaje)
    println(salario_cobrar)

}