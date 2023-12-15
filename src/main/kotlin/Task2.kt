fun main() {

    val userOne = User2(
        id = 1,
        login = "Vladimir",
        password = "123456",
        mail = "vladimir@gmail.com",
    )

    userOne.outputInformation()
    userOne.inputInformation()
    userOne.changePassword()
}