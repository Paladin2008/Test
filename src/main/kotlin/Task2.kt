fun main() {

    val ingredient = arrayOf("текила", "апельсиновый сок", "сироп", "лед")

    println("Введите ингедиент")
    val inputUser = readln()

    for (i in ingredient) {
        if (i == inputUser) {
            println("Ингрединет $inputUser есть в Текила санрайз")
            return
        }
    }
    println("Ингредиент не найдет")
}