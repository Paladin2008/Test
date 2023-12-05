fun main() {

    val ingredients = arrayOf("текила", "апельсиновый сок", "сироп", "лед")
    println(ingredients.contentToString())

    println("Какой ингредиент вы хотите заменить?")
    val inputUser = readln()

    for (i in ingredients) {
        if (i == inputUser) {
            println("Ингрединет ${inputUser} есть в Текила санрайз")
            continue
        }
    }

    if(ingredients != inputUser){
        println("Не найден")
    }

    val ingredientReplace = ingredients.indexOf(inputUser)

    println("На какой ингредиент вы хотите изменить?")
    val inputNewIngredient = readln()
    ingredients[ingredientReplace] = inputNewIngredient

    println("Вы сохранили список ингредиентов")
    for (ingredient in ingredients) {
        println(ingredient)
    }
}