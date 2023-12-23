class weather() {

    var daytimeTemperature = "0"
    var nightTemperature = "0"
    var precipitation: List<String> = listOf("0")

    fun weatherShow() {
        println("Дневная температура $daytimeTemperature")
        println("Ночная температура $nightTemperature")
        println("Наличие осадков $precipitation")
    }
}

fun main() {

    val firstDay = weather()
    println("Первый день")
    firstDay.daytimeTemperature = "+40"
    firstDay.nightTemperature = "-30"
    firstDay.precipitation = listOf("Днем кислотный дождь переменная облачность", "Ночью ясно")
    firstDay.weatherShow()

    val secondDay = weather()
    println("Второй день")
    secondDay.daytimeTemperature = "+20"
    secondDay.nightTemperature
    secondDay.precipitation = listOf("Днем дождь", "Ночью облачно")
    secondDay.weatherShow()
}