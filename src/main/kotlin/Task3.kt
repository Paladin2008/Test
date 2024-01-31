//Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.
//Для того, чтобы взаимодействовать со всеми записями телефонной книги, как с одним целым, их нужно объединить в список.
//- создай и инициализируй (одновременно) список с 5 объектами класса-контакта;
//- 2 контакта должны принимать null для поля компании;
//- 1 контакт должен иметь название компании “null”;
//- выведи список всех существующих компаний, которые есть в телефонной книге.
class PhoneDirectory(
    val name: String,
    val phone: Long,
    var company: String? = null,
)

fun main() {

    val listPersons = mutableListOf(
        PhoneDirectory(name = "Ростислав", phone = 89123456789, company = "Green"),
        PhoneDirectory(name = "Владимир", phone = 89178321111, company = "Blue"),
        PhoneDirectory(name = "Денис", phone = 89178322222),
        PhoneDirectory(name = "Иван", phone = 89178323333),
        PhoneDirectory(name = "Никита", phone = 89178324444, company = "null"),
    )

    val newList = listPersons.map {
        it.company
    }

    newList.forEach{ println(it)}
}