fun main() {

    val indredient1 = "Яйцо"
    val indredient2 = "Помидор"
    val indredient3 = "Соль"
    val indredient4 = "Зелель"
    val indredient5 = "Хлеб"

    val arrayOfIngredient = arrayOf("Яйцо", "Помидор", "Соль", "Зелень", "Хлеб")

//    val intArray1 = intArrayOf(4, 3, 4)
//
//    var intArray3 = intArrayOf(1, 2, 3, 4, 5)
//    intArray3 = intArrayOf(1, 2, 3, 4, 6)
//
//    println("Размер массива ${arrayOfIngredient.size}")
//    println(arrayOfIngredient[3])
//
//    arrayOfIngredient[4] = "Тест"
//    println(arrayOfIngredient[4])

    for (i in arrayOfIngredient) {
        println("Ингредиент ${arrayOfIngredient.indexOf(i) + 1} $i")
    }
}