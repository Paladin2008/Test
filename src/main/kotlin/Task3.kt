//Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.
//- в этой задаче используй первичный конструктор без выделения памяти под свойства;
//- поля должны быть объявлены и проинициализированы в теле класса;
//- все поля с температурой должны иметь тип Int;
//- программа не должна иметь других функций, кроме метода вывода информации о погоде.
//В конструктор передается температура в Кельвинах. При обращении к полям с температурой возвращаются данные в Цельсиях.
//Cоздай объект с произвольными данными и выведи в консоль методом созданного класса.

class Weather() {

    var daytimeTemperature = 0
    var nightTemperature = 0
    var presencePrecipitation = false
}

fun main() {

    val firstDay = Weather()
    firstDay.daytimeTemperature = 277
    firstDay.nightTemperature = 274
    firstDay.presencePrecipitation = true

    val conversionOne = firstDay.daytimeTemperature - 273
    val conversionTwo = firstDay.nightTemperature - 273

    when(firstDay.presencePrecipitation) {
        false -> println("Остадков нет")
        else -> println("Осадки есть")
    }

    println("Температура в Цельсиях $conversionOne")
    println("Температура в Цельсиях $conversionTwo")
}
