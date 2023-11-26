fun main() {

    val oneWin = 5
    val twoWin = 10

    println("Введи первое число")
    val userEnterOne = readln()!!.toInt()
    println("Введи второе число")
    val userEnterTwo = readln()!!.toInt()

    if (userEnterOne == oneWin && userEnterTwo == twoWin || userEnterOne == twoWin && userEnterTwo == oneWin) {
        println("Вы выиграли")
    } else if(userEnterOne == oneWin && userEnterTwo != twoWin || userEnterOne != oneWin && userEnterTwo == twoWin) {
        println("Утешительный приз")
    } else if(userEnterOne != oneWin && userEnterTwo != twoWin) {
        println("Не выиграли")
    }
}
