fun main() {

    val ingredients = listOf(2, 50, 15)

    print("Введите количество порций ")
    val portions = readln().toInt()

    val countIngredients = ingredients.map {
        it * portions
    }

    println("На $portions порций вам понадобится ")
    println(
        "Яиц – ${countIngredients[0]}, " +
                "молока – ${countIngredients[1]} мл, " +
                "сливочного масла – ${countIngredients[2]} гр"
    )
}