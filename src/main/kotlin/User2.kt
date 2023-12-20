class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String?
) {

    fun outputInformation() {
        println("id пользователя $id")
        println("Логин $login")
        println("Пароль $password")
        println("Почта $mail")
    }

    fun inputInformation() {
        println("Расскажи о себе")
        bio = readln()
    }

    fun changePassword() {
        println("Введите текущий пароль")
        val newPassword = readln()

        val compare = when (newPassword) {
            password -> {
                println("Введите новый пароль")
                password = readln()
                println("Пароль изменен")
                println("-------Данные обновлены-------")
                outputInformation()
                println("-----------О себе-------------")
                println(bio)
            }
            else -> println("Текущий пароль не верный")
        }
    }
}

