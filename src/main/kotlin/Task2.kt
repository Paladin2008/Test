fun main() {

    val ingredients = mutableListOf("курица", "сыр", "соус")
    println("В рецепте есть базовые ингредиенты ${ingredients}")

    val resposn = "да"

    println("Желаете добавить еще?")
    val inputUserOptions = readln().toLowerCase()

    if (resposn == inputUserOptions) {
        println("Какой ингредиент вы желаете добавить?")
        val addIngrediens = readln()

        ingredients.add(addIngrediens)
        println("Теперь в рецепте есть следующие ингредиенты $ingredients")
    }
}