class Weather(val daytimeTemperature: String, val nightTemperature: String, val presencePrecipitation: Boolean) {

    fun weatherShow() {
        println("Дневная температура $daytimeTemperature")
        println("Ночная температура $nightTemperature")
        println("Наличие осадков $presencePrecipitation")
    }
}

fun main() {

    val firstDay = Weather(
        daytimeTemperature = "+40",
        nightTemperature = "-30",
        presencePrecipitation = true,
    ).weatherShow()

    val secondDay = Weather(
        daytimeTemperature = "+20",
        nightTemperature = "0",
        presencePrecipitation = false,
    ).weatherShow()
}