class weather() {

    var daytimeTemperature = "0"
    var nightTemperature = "0"
    var presencePrecipitation = false

    fun weatherShow() {
        println("Дневная температура $daytimeTemperature")
        println("Ночная температура $nightTemperature")
        println("Наличие осадков $presencePrecipitation")
    }
}

fun main() {

    val firstDay = weather()
    println("Первый день")
    firstDay.daytimeTemperature = "+40"
    firstDay.nightTemperature = "-30"
    firstDay.presencePrecipitation = true
    firstDay.weatherShow()

    val secondDay = weather()
    println("Второй день")
    secondDay.daytimeTemperature = "+20"
    secondDay.nightTemperature
    secondDay.presencePrecipitation
    secondDay.weatherShow()
}