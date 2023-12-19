fun main() {

    val userOne = User(
        id = 1,
        login = "Vladimir",
        password = "123456",
        mail = "vladimir@gmail.com"
    )

    val userTwo = User(
        id = 2,
        login = "Ivan",
        password = "Qwerty",
        mail = "ivan@gmail.com"
    )

    println(userOne.id)
    println(userOne.login)
    println(userOne.password)
    println(userOne.mail)
    println()
    println(userTwo.id)
    println(userTwo.login)
    println(userTwo.password)
    println(userTwo.mail)
}

