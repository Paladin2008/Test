//Измени программу таким образом, чтобы информация о погоде выводилась в консоль сразу при создании объекта.
class Weather(var dayTimeTemperature: Int, var nightTemperature: Int, var presencePrecipitation: Boolean) {

    val conversionDayTime = dayTimeTemperature - 273
    val conversionNightTime = nightTemperature - 273

    init {
        println("Температура в Цельсиях $conversionDayTime")
        println("Температура в Цельсиях $conversionNightTime")
        when (presencePrecipitation) {
            false -> println("Остадков нет")
            else -> println("Осадки есть")
        }
    }
}

fun main() {

    val firstDay = Weather(277, 274, true)
}