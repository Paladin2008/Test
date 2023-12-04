fun main() {

    val ingredients = listOf("текила", "апельсиновый сок", "сироп", "лед")
    println("В рецепте есть следующие ингрединеты $ingredients.")

    ingredients.forEach{
        println(it)
    }
}