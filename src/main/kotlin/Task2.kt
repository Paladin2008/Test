class weather(val daytimeTemperature: String, val nightTemperature: String, val precipitation: List<String>) {

    fun weatherShow() {
        println("Дневная температура $daytimeTemperature")
        println("Ночная температура $nightTemperature")
        println("Наличие осадков $precipitation")
    }
}

fun main() {

    val firstDay = weather(
        daytimeTemperature = "+40",
        nightTemperature = "-30",
        precipitation = listOf("Днем кислотный дождь переменная облачность", "Ночью ясно"),
    ).weatherShow()

    val secondDay = weather(
        daytimeTemperature = "+20",
        nightTemperature = "0",
        precipitation = listOf("Днем дождь", "Ночью облачно"),
    ).weatherShow()

}