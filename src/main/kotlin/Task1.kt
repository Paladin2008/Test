import kotlin.random.Random

fun main() {

    val personNumbers = move()
    val computerNumbers = move()

    println("У человека выпало $personNumbers")
    println("У компьютера выпало $computerNumbers")

    if (personNumbers == computerNumbers) println("Ничья")
    else if(personNumbers > computerNumbers) println("Победил человек")
    else if(personNumbers < computerNumbers) println("Победил компьютер")
}

fun move(): Int {

    val numbers = Random.nextInt(1, 6)
    return numbers
}