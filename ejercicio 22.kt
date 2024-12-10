//22. Visualización de raíces: Representa gráficamente un polinomio P(x) y
//marca en la gráfica las raíces reales calculadas

import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.utils.ColorTemplate
import kotlin.math.pow

fun graficaFuncionYTangente(chart: LineChart, puntoTangente: Double) {
    // Datos para la función
    val xValues = (-10..10).toList().map { it.toDouble() }
    val yValues = xValues.map { 23 - 4 * it.pow(2) + 6 * it }

    // Datos para la recta tangente
    val pendiente = -8 * puntoTangente + 6
    val ordenadaOrigen = 23 - 4 * puntoTangente.pow(2) + 6 * puntoTangente - pendiente * puntoTangente

    val yTangente = xValues.map { pendiente * it + ordenadaOrigen }

    // Crear los datasets
    val set1 = LineDataSet(yValues.withIndex().map { Entry(it.index.toFloat(), it.value.toFloat()) }, "Función")
    set1.color = ColorTemplate.COLORFUL_COLORS[0]

    val set2 = LineDataSet(yTangente.withIndex().map { Entry(it.index.toFloat(), it.value.toFloat()) }, "Tangente")
    set2.color = ColorTemplate.COLORFUL_COLORS[1]

    // Crear los datos y asignarlos al gráfico
    val data = LineData(set1, set2)
    chart.data = data

    // Personalizar el gráfico (opcional)
    chart.description.isEnabled = false
    chart.setTouchEnabled(true)
    chart.isDragEnabled = true
    chart.setScaleEnabled(true)
    chart.axisLeft.setAxisMinimum(0f)
    chart.axisRight.isEnabled = false

    chart.invalidate()
}