//Gráfica una función f(x) = x^3 - 4*x^2 + 6x como y, en el
//mismo gráfico, muestra la recta tangente en un punto dado.

import io.github.smbarbour.kotlincharts.KotlinCharts
import io.github.smbarbour.kotlincharts.charts.LineChart
import io.github.smbarbour.kotlincharts.data.Entry
import io.github.smbarbour.kotlincharts.data.LineData
import io.github.smbarbour.kotlincharts.data.LineDataSet
import kotlin.math.pow

fun main() {
    // Función a graficar
    fun f(x: Double): Double = x.pow(3) - 4 * x.pow(2) + 6 * x

    // Punto en el que se calculará la tangente
    val x0 = 2.0
    val y0 = f(x0)

    // Derivada de la función (pendiente de la recta tangente)
    fun df(x: Double): Double = 3 * x.pow(2) - 8 * x + 6
    val m = df(x0) // Pendiente de la recta tangente

    // Generar datos para la gráfica
    val xValues = (-5..5).toList().map { it.toDouble() }
    val yValues = xValues.map { f(it) }
    val tangentValues = xValues.map { m * (it - x0) + y0 }

    // Crear los conjuntos de datos
    val functionDataSet = LineDataSet(xValues.zip(yValues).map { Entry(it.first.toFloat(), it.second.toFloat()) }, "f(x)")
    val tangentDataSet = LineDataSet(xValues.zip(tangentValues).map { Entry(it.first.toFloat(), it.second.toFloat()) }, "Tangente")

    // Configurar la gráfica
    val chart = LineChart()
    chart.data = LineData(functionDataSet, tangentDataSet)

    // Mostrar la gráfica
    KotlinCharts.show(chart)
}

fun LineDataSet(map: List<Unit>, s: String): Any {

}