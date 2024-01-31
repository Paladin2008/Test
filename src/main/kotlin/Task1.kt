//Для программы телефонного справочника создай класс, который будет хранить имя, номер телефона и компанию.
//Номер телефона – целочисленное значение (Long).
//При создании объекта компания может оставаться незаполненной. Вместо пустой строки поле может принимать null.
//Все свойства класса не должны иметь инициализации по умолчанию.
class PhoneDirectory(
    val name: String,
    val phone: Long,
    val company: String?,
)

fun main() {

    val person = PhoneDirectory(
        name = "Vladimir",
        phone = 89174888888,
        company = null
    )

    println(person.name)
    println(person.phone)
    println(person.company)
}