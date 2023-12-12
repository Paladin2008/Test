import kotlin.random.Random

fun main() {

    var counter = 0

    while (true) {
        playRound()


        println("Хотите сыграть еще раз?")
        val enterAnswer = readln()?.lowercase()
        if (enterAnswer == "нет") {
            println("Человек победил $counter раз")
            return
        } else if (enterAnswer != "да") {
            println("Введены не корректные данные")
            break
        } else if (enterAnswer == "да") {
            counter++
        }
    }
}

fun playRound() {

    val personNumbers = roll()
    val computerNumbers = roll()

    println("У человека выпало $personNumbers")
    println("У компьютера выпало $computerNumbers")

    if (personNumbers == computerNumbers) println("Ничья")
    else if (personNumbers > computerNumbers) println("Победил человек")
    else if (personNumbers < computerNumbers) println("Победил компьютер")
}

fun roll(): Int {
    return Random.nextInt(1, 6)
}