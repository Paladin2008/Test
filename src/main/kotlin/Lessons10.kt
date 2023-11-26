fun main() {

    nameAndAge(userName = getName(), userAge = getAge())
}

fun getName(): String? = readLine()

fun getAge(): Int? = readLine()?.toInt()

fun nameAndAge (userName: String?, userAge: Int?) {
    println("Данные $userName, $userAge")
}