//Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.
//- в этой задаче используй первичный конструктор без выделения памяти под свойства;
//- поля должны быть объявлены и проинициализированы в теле класса;
//- все поля с температурой должны иметь тип Int;
//- программа не должна иметь других функций, кроме метода вывода информации о погоде.
//В конструктор передается температура в Кельвинах. При обращении к полям с температурой возвращаются данные в Цельсиях.
//Cоздай объект с произвольными данными и выведи в консоль методом созданного класса.

class Weather(dayTimeTemperature: Int, nightTemperature: Int, presencePrecipitation: Boolean) {


    var dayTimeTemperature = dayTimeTemperature
    var nightTemperature = nightTemperature
    var presencePrecipitation = presencePrecipitation


    fun weatherShow() {
        val conversionDayTime = dayTimeTemperature - 273
        val conversionNightTime = nightTemperature - 273
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
    firstDay.weatherShow()
}
