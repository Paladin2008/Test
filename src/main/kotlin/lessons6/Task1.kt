package lessons6

fun main() {

    println("Задайте логин")
    val createLogin = readln()
    println("Задайте пароль")
    val createPassword = readln()

    do {
        println("Введите логин")
        var enterLogin = readLine()

        println("Введите пароль")
        var enterPassword = readLine()

        if (enterLogin != createLogin || enterPassword != createPassword) {
            println("Неверный логин или пароль. Попробуйте снова.")
        }
    } while (enterLogin != createLogin || enterPassword != createPassword)

    println("Авторизация прошла успешно")
}