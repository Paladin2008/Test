fun main() {

    val ingredients = arrayOf("текила", "апельсиновый сок", "сироп", "лед")
    println(ingredients.contentToString())

    println("Какой ингредиент вы хотите заменить?")
    val inputUser = readln()


    val ingredientReplace = ingredients.indexOf(inputUser)

    when (inputUser) {
        ingredients[0] -> println("Ингрединет ${ingredients[0]} есть в этом напитке")
        ingredients[1] -> println("Ингрединет ${ingredients[1]} есть в этом напитке")
        ingredients[2] -> println("Ингрединет ${ingredients[2]} есть в этом напитке")
        ingredients[3] -> println("Ингрединет ${ingredients[3]} есть в этом напитке")
        else -> return println("Ингредиент не найдет")
    }

    println("На какой ингредиент вы хотите изменить?")
    val inputNewIngredient = readln()
    ingredients[ingredientReplace] = inputNewIngredient

    println("Вы сохранили список ингредиентов")
    for (ingredient in ingredients) {
        println(ingredient)
    }
}