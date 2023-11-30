fun main() {

    println("Введите число")
    val inputUser = readln().toInt()

    val firstNumber = 0 .. inputUser

    for(i in firstNumber step 2)
        println(i)
}