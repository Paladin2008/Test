fun main() {

    println("Сколько нужно засечь времени")
    val seconds = readln().toInt()

    for(i in seconds downTo 1) {
        println("Осталось секунд $i")
        Thread.sleep(1000)
    }
    println("Время вышло")
}

