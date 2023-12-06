fun main() {

    val ingredients = arrayOf("текила", "апельсиновый сок", "сироп", "лед")
    println(ingredients)

    println("Какой ингредиент вы хотите заменить?")
    val inputUser = readln().toLowerCase()

    for (i in ingredients) {
        if (i == inputUser) {
            println("Ингрединет ${inputUser} есть в Текила санрайз")
            val ingredientReplace = ingredients.indexOf(inputUser)

            println("На какой ингредиент вы хотите изменить?")
            val inputNewIngredient = readln()
            ingredients[ingredientReplace] = inputNewIngredient

            println("Вы сохранили список ингредиентов")
            for (ingredient in ingredients) {
                println(ingredient)
            }
            return
        }
    }
    println("Ингредиент не найден")
}