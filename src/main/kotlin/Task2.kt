fun main() {

    validation()
}

fun getLogin(): String {
    println("Введите логин")
    val login = readln()
    return login
}

fun getPassword(): String {
    println("Введите пароль")
    val password = readln()
    return password
}

fun validation() {
    val login = getLogin()
    val password = getPassword()

    if (login.length < 4 || password.length < 4) {
        println("Логин или пароль недостаточно длинные")
        return
    }
    println("Вы авторизовались")
}