fun main() {

    val code = (1000..9999).random()
    println("Ваш код авторизации $code")

    val saveCode = code

    println("Введите код")
    val enterCode = readLine()!!.toInt()

    if (enterCode == saveCode) {
        println("Авторизация успешна")
    } else {
        println("Не верный код. Вам отправлен код повторно")
        return main()
    }
}